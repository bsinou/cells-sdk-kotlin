
group = "org.sinou.android.kotlin"
version = "0.1.1-dev"

tasks.wrapper {
    gradleVersion = "8.1"
    distributionUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-all.zip"
}

buildscript {
    repositories {
        maven("https://repo1.maven.org/maven2" )
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23")
        classpath("com.diffplug.spotless:spotless-plugin-gradle:6.25.0")
    }
}

plugins {
    kotlin("jvm") version "1.9.23"
    id("maven-publish")
    id("com.diffplug.spotless") version "6.25.0"
}


kotlin {
    jvmToolchain(21)
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
        target("**/*.kt")
        ktfmt()
    }
    format("misc") {
        target("**/.gitignore", "**/*.md", "**/*.gradle")
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.23")
    implementation ("org.jetbrains.kotlin:kotlin-reflect:1.9.23")
    implementation ("com.squareup.moshi:moshi-kotlin:1.15.2")
    implementation ("com.squareup.moshi:moshi-adapters:1.15.2")
    implementation ("com.squareup.okhttp3:okhttp:4.12.0")
    testImplementation ("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}
