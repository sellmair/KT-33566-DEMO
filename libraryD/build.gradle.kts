plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdkVersion(28)
}

dependencies {
    implementation(kotlin("stdlib-jdk7"))
    implementation(project(":libraryA"))
    implementation(project(":libraryB"))
    implementation(project(":libraryC"))
}

