plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform")
}

android {
    compileSdkVersion(28)
}

kotlin {
    android()
    sourceSets {
        
        // Version 1: Cannot resolve type `LibraryA` in `LibraryBAndroidTest
        commonMain.get().dependencies {
            implementation(kotlin("stdlib-common"))
            implementation(project(":utils"))
            implementation(project(":libraryA"))
        }



        /*
        // Version 2: `LibraryA` can be resolved for in `LibraryBAndroidTest
        commonMain.get().dependencies {
            implementation(kotlin("stdlib-common"))
            //implementation(project(":utils"))
            implementation(project(":libraryA"))
        }
         */


        /*
        // Version 3: `LibraryA` can be resolved for in `LibraryBAndroidTest
        commonMain.get().dependencies {
            implementation(kotlin("stdlib-common"))
            implementation(project(":libraryA"))
            implementation(project(":utils"))
        }
        */
        
    }
}