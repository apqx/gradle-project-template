plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.7.10"

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

group = "me.apqx"
version = "1.0.0"

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    // Kotlin coroutine
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    // Ktor
    val ktorVersion = "2.1.0"
    // ktor使用的HTTP引擎
    implementation("io.ktor:ktor-client-okhttp:$ktorVersion")
    // Ktor实现的核心代码
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    // Ktor的日志插件
    implementation("io.ktor:ktor-client-logging:$ktorVersion")
    // Ktor根据Accept和Content-Type判断Body数据类型，并自动与json、xml转换的插件
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
    // Ktor支持json转换的gson插件
    implementation("io.ktor:ktor-serialization-gson:$ktorVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
val compileKotlin: org.jetbrains.kotlin.gradle.tasks.KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: org.jetbrains.kotlin.gradle.tasks.KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

application {
    // Define the main class for the application.
    mainClass.set("me.apqx.AppKt")
}
