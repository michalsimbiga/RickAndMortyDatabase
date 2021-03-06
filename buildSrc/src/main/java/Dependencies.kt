@file:Suppress("MayBeConstant")

object ApplicationID {
    val id = "com.rickandmortydatabase"
}

object Releases {
    val versionCode = 1
    val versionName = "1"
}

object Modules {
    val app = ":app"
    val domain = ":domain"
    val data = ":data"
}

object Versions {
    val kotlin = "1.3.71"

    val gradle = "3.5.1"
    val minSDK = 23
    val targetSDK = 29
    val compileSDK = 29
    val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    val buildToolsVersion = "29.0.2"

    val kotlinCoroutines = "1.3.8"

    val navigation = "2.3.0"
    val appCompat = "1.1.0"
    val material = "1.2.0-rc01"
    val core_ktx = "1.3.0"
    val constraint = "1.1.3"
    val swipeRefresh = "1.1.0"

    val retrofit = "2.9.0"
    val okhttp = "4.8.0"
    val loggingInterceptor = "4.8.0"

    val moshi = "1.9.3"
    val moshiCodegen = "1.9.3"

    val koinAndroidX = "2.1.6"
    val koinViewModelAndroidX = "2.1.6"

    val mvrx = "1.5.1"
    val epoxy = "3.11.0"

    val firebase = "4.3.3"
    val firebaseCrashlitycs = "2.2.0"
    val analytics = "17.4.4"
    val crashlytics = "17.1.1"

    val sqldelight = "1.4.0"

    val room = "2.2.5"

    val threeTen = "1.2.4"

    val junit = "4.13"
    val ext_junit = "1.1.1"
    val espresso = "3.2.0"
    val espressoIntents = "3.2.0"
    val mockk = "1.10.0"
    val assertjCore = "3.16.1"
    val threetenabp = "1.3.2"
    val fragmentTesting = "1.2.5"
    val androidxCore = "1.2.0"
    val awaitility = "4.0.3"

    val timber = "4.7.1"

    val leakCanary = "2.4"

    val ktlint = "0.31.0"

    val viewPager2 = "1.0.0"
}

object Libraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val coreKtx = "androidx.core:core-ktx:${Versions.core_ktx}"
    val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
    val swipeRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefresh}"

    val koinAndroidX = "org.koin:koin-androidx-scope:${Versions.koinAndroidX}"
    val koinViewModelAndroidX = "org.koin:koin-androidx-viewmodel:${Versions.koinViewModelAndroidX}"

    val kotlinCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"

    val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    val okHttpInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshiCodegen}"
    val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"

    val epoxy = "com.airbnb.android:epoxy:${Versions.epoxy}"
    val epoxyGlide = "com.airbnb.android:epoxy-glide-preloading:${Versions.epoxy}"
    val epoxyKapt = "com.airbnb.android:epoxy-processor:${Versions.epoxy}"

    val mvrx = "com.airbnb.android:mvrx:${Versions.mvrx}"

    val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx:${Versions.analytics}"
    val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics:${Versions.crashlytics}"

    val sqldelightAndroidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqldelight}"

    val room = "androidx.room:room-runtime:${Versions.room}"
    val roomAnnotationProcessor = "androidx.room:room-compiler:${Versions.room}"
    val roomKotlinExt = "androidx.room:room-ktx:${Versions.room}"

    val threeTen = "com.jakewharton.threetenabp:threetenabp:${Versions.threeTen}"

    val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navigationKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    val material = "com.google.android.material:material:${Versions.material}"

    val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"

    val ktlint = "com.github.shyiko:ktlint:${Versions.ktlint}"

    val viewPager2 = "androidx.viewpager2:viewpager2:${Versions.viewPager2}"
}

object TestLibraries {
    val mvrx = "com.airbnb.android:mvrx-testing:${Versions.mvrx}"
    val assertjCore = "org.assertj:assertj-core:${Versions.assertjCore}"
    val mockk = "io.mockk:mockk:${Versions.mockk}"
    val junit = "junit:junit:${Versions.junit}"
    val extJunit = "androidx.test.ext:junit:${Versions.ext_junit}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val espressoIntents = "androidx.test.espresso:espresso-intents:${Versions.espressoIntents}"
    val kotlinCoroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"
    val sqldelightSqliteDriver = "com.squareup.sqldelight:sqlite-driver:${Versions.sqldelight}"
    val threetenabp = "org.threeten:threetenbp:${Versions.threetenabp}"
    val fragmentTesting = "androidx.fragment:fragment-testing:${Versions.fragmentTesting}"
    val koin = "org.koin:koin-test:${Versions.koinAndroidX}"
    val customInstrumentationRunner = "customerinformationcenter.KoinTestRunner"
    val androidxCore = "androidx.test:core:${Versions.androidxCore}"
    val awaitility = "org.awaitility:awaitility:${Versions.awaitility}"
    val roomTest =  "androidx.room:room-testing:${Versions.room}"
}
