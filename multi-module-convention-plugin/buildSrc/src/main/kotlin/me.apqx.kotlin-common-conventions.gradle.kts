import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    constraints {
        // Define dependency versions as constraints
        implementation("com.google.code.gson:gson:2.9.1")
    }
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
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
