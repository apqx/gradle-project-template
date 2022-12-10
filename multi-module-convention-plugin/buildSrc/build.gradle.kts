plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
}

dependencies {
    // 定义可以被工程使用的plugin，包括buildSrc中的kts和module的build.gradle.kts
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
}
