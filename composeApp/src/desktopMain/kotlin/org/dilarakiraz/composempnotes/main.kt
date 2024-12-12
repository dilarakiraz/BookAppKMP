package org.dilarakiraz.composempnotes

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.ktor.client.engine.okhttp.OkHttp
import org.dilarakiraz.composempnotes.app.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "BookAppKMP",
    ) {
        App(
            engine = remember { OkHttp.create() }
        )
    }
}