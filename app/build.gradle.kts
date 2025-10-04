plugins {
    id("com.android.application")
}

android {
    namespace = "com.AdeebTechLab.OnlineWorkOrder"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.AdeebTechLab.OnlineWorkOrder"
        minSdk = 24
        targetSdk = 35
        versionCode = 5
        versionName = "0.5"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    ndkVersion = "29.0.14033849" // e.g.,  ndkVersion "21.3.6528147"
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.13.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")

    //noinspection Aligned16KB
    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.29")
}