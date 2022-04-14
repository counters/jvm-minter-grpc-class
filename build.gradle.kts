import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.20"
//    application
}
val grpcKotlinVersion = "1.2.1"
val coroutinesVersion = "1.6.1"


group = "com.webcounters"
version = "v1.1.0"

repositories {
//    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.protobuf:protobuf-java:3.20.0")
    implementation("com.google.protobuf:protobuf-kotlin:3.20.0")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")

    implementation ("io.grpc:grpc-netty-shaded:1.45.1")
    implementation ("io.grpc:grpc-protobuf:1.45.1")
    implementation ("io.grpc:grpc-stub:1.45.1")
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
