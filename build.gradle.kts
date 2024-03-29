buildscript {

    repositories {
        jcenter()
        mavenCentral()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
    }

}

allprojects {
    repositories {
        mavenCentral()
        jcenter()
        google()
    }
}