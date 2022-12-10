plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
}

dependencies {
    // project/build.gradle.kts中定义的plugin也可以在这里定义，同样可以被所有module使用
}
