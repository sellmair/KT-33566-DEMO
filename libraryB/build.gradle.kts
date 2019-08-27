plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform")
}

android {
    compileSdkVersion(28)
}

kotlin {
    android("android")
    sourceSets {
        commonMain.get().dependencies {
            implementation(kotlin("stdlib-common"))
            implementation(project(":utils"))
            implementation(project(":libraryA"))
        }

        getByName("androidMain").dependencies {
            implementation(kotlin("stdlib-jdk8"))
        }
    }
}