Gradle project templates using repository mirror in China mainland

# gradle wrapper

```sh
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
distributionUrl=https://mirrors.cloud.tencent.com/gradle/gradle-7.4.2-bin.zip
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists
```

# maven central

```kotlin
repositories {
    // Use Maven Central for resolving dependencies.
    // mavenCentral()
    maven { url = uri ("https://maven.aliyun.com/repository/central") }
}
```