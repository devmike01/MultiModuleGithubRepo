plugins {
    AppPlugins.get().forEach {
        this.id(it)
    }
}

android{
    compileSdkVersion(SdkVersions.compile)
    defaultConfig {
        minSdkVersion(SdkVersions.min)
        targetSdkVersion(SdkVersions.target)
        versionCode = SdkVersions.versionCode
        versionName = SdkVersions.versionName
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {

    implementation(project(":core"))
}
