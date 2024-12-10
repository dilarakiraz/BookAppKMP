package org.dilarakiraz.composempnotes

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.dilarakiraz.composempnotes.app.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "BookAppKMP",
    ) {
        App()
    }
}