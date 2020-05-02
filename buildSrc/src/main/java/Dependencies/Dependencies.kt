package Dependencies

/**
 * Created by Gbenga Oladipupo on 02/05/2020.
 */
object Versions{
    const val retrofit ="2.8.1"
    const val retrofit_converter ="2.1.0"
    const val dagger ="2.27"
    const val kotlin ="1.3.72"
    const val kotlin_core ="1.2.0"
    const val junit ="4.13"
    const val junit_test="1.1.1"
    const val espresso_core ="3.2.0"
}

object Deps{
    const val espresso_core_test ="androidx.test.espresso:espresso-core:${Versions.espresso_core}"
    const val junit_test ="androidx.test.ext:junit:${Versions.junit_test}"
    const val junit ="junit:junit:${Versions.junit}"
    const val kotlin_core_ktx ="androidx.core:core-ktx:${Versions.kotlin_core}"
    const val retrofit_gson_converter="com.squareup.retrofit2:converter-gson:${Versions.retrofit_converter}"
    const val retrofit_lib ="com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val dagger ="com.google.dagger:dagger:${Versions.dagger}"
    const val dagger_processor ="com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val kotlin_stlib ="org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_gradle ="org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}