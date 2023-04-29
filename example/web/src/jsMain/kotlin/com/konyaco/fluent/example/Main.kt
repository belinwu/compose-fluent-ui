package com.konyaco.fluent.example

// FIXME Do not remove this import. It is required to work.
import androidx.compose.runtime.* 
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import org.jetbrains.skiko.wasm.onWasmReady

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        CanvasBasedWindow("Compose Fluent") {
            ExampleTheme {
                App()
            }
        }
    }
}
