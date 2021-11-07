import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
//    application
}

group = "com.webcounters"
version = "v1.0.1"

repositories {
//    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.protobuf:protobuf-java:3.19.1")
    implementation("com.google.protobuf:protobuf-kotlin:3.19.1")


    implementation ("io.grpc:grpc-netty-shaded:1.41.0")
    implementation ("io.grpc:grpc-protobuf:1.41.0")
    implementation ("io.grpc:grpc-stub:1.41.0")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

/*application {
    mainClass.set("MainKt")
}*/
