pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven ("https://repo1.maven.org/maven2")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "sdk-openapi-moshi"
