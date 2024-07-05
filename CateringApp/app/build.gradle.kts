plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.catheringapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.catheringapp"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

    // Lifecycle components
    implementation ("androidx.lifecycle:lifecycle-livedata:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel:2.3.1")
    implementation ("android.arch.lifecycle:extensions:1.1.1")
    annotationProcessor ("android.arch.lifecycle:compiler:1.1.1")

    // Room Database
    implementation ("androidx.room:room-rxjava3:2.3.0")
    implementation ("androidx.room:room-runtime:2.3.0")
    annotationProcessor ("androidx.room:room-compiler:2.3.0")

    // Glide
    implementation ("com.github.bumptech.glide:glide:4.15.1")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.15.1")

    // Rx Java
    implementation ("io.reactivex.rxjava3:rxandroid:3.0.0")
    implementation ("io.reactivex.rxjava3:rxjava:3.0.0")
}