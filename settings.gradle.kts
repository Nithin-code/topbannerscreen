rootProject.name = "topbannerscreen"
include(":topbannerscreen")


pluginManagement {

    val props = java.util.Properties().apply {
        val file = File(settingsDir, "gradle.properties")
        if (file.exists()) {
            file.inputStream().use { load(it) }
        }
    }

    val kotlinVersion = props["kotlin.version"] as String
    val agpVersion = props["agp.version"] as String
    val composeVersion = props["compose.version"] as String

    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    plugins {

        kotlin("jvm").version(kotlinVersion)
        kotlin("multiplatform").version(kotlinVersion)
        kotlin("android").version(kotlinVersion)

        id("com.android.application").version(agpVersion)
        id("com.android.library").version(agpVersion)

        id("org.jetbrains.compose").version(composeVersion)
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.4.0")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
