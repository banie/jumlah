plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeHotReload) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
}

// Configure Java toolchain for all subprojects
//subprojects {
//    tasks.withType<JavaCompile>().configureEach {
//        options.release.set(17)
//    }
//    afterEvaluate {
//        // Only apply release option to non-Android modules
//        if (!plugins.hasPlugin("com.android.application") && !plugins.hasPlugin("com.android.library")) {
//            tasks.withType<JavaCompile>().configureEach {
//                options.release.set(17)
//            }
//        }
//
//        extensions.findByType<JavaPluginExtension>()?.apply {
//            toolchain {
//                languageVersion.set(JavaLanguageVersion.of(17))
//            }
//        }
//    }
//}