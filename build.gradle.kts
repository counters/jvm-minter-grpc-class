import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.google.protobuf.gradle.*

plugins {
    kotlin("jvm") version "1.5.20"
    id("com.google.protobuf") version "0.9.1"
    `maven-publish`
}

group = "counters"
version = "1.3.2"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.protobuf:protobuf-java:3.21.12")
    implementation("com.google.protobuf:protobuf-kotlin:3.21.12")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("io.grpc:grpc-kotlin-stub:1.3.0")

    implementation ("io.grpc:grpc-netty-shaded:1.50.2")
    implementation ("io.grpc:grpc-protobuf:1.50.2")
    implementation ("io.grpc:grpc-stub:1.50.2")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

publishing {
    repositories {
        maven {
            name = "jvm-minter-grpc-class"
            url = uri("https://maven.pkg.github.com/counters/jvm-minter-grpc-class")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.20.0"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.50.2"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:1.3.0:jdk8@jar"
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc")
                id("grpckt")
            }
            it.builtins {
                id("kotlin")
            }
        }
    }
    generatedFilesBaseDir = "$projectDir/src/generated"
}
