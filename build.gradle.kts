plugins {
    kotlin("multiplatform") version "1.8.20" apply false
    id("org.jetbrains.compose") version "1.4.0-dev-wasm06" apply false
    id("com.android.library") version "7.4.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
}

group = "com.konyaco"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
    }

    configurations.all {
        val conf = this
        // Currently it's necessary to make the android build work properly
        conf.resolutionStrategy.eachDependency {
            val isWasm = conf.name.contains("wasm", true)
            val isJs = conf.name.contains("js", true)
            val isComposeGroup = requested.module.group.startsWith("org.jetbrains.compose")
            val isComposeCompiler = requested.module.group.startsWith("org.jetbrains.compose.compiler")
            if (isComposeGroup && !isComposeCompiler && !isWasm && !isJs) {
                useVersion("1.4.0")
            }
        }
    }
}
