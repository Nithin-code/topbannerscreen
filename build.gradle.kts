plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    kotlin("multiplatform") version "1.9.21" apply false
    id("com.android.library") version "8.0.2" apply false
    id("org.jetbrains.compose") version "1.5.11" apply false
}


allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

