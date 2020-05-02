/**
 * Created by Gbenga Oladipupo on 02/05/2020.
 */


object PluginVersions{
    const val kotlin ="1.3.72"
    const val gradle_plugin ="3.6.3"
}

object AppPlugins{

    fun get() = mutableListOf<String>("com.android.library", "kotlin-android",
        "kotlin-android-extensions", "kotlin-kapt")
}


object ProjectPlugins{
    const val build_gradle ="com.android.tools.build:gradle:${PluginVersions.gradle_plugin}"
    const val kotlin_gradle ="org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersions.kotlin}"
}