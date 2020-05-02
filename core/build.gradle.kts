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
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    CoreDeps.get().forEach { dep ->
        api(dep)
        logger.debug("Deps: $dep")
    }
}
