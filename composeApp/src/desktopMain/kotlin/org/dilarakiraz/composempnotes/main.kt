package org.dilarakiraz.composempnotes

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.dilarakiraz.composempnotes.app.App
import org.dilarakiraz.composempnotes.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Book App"
        ) {
            App()
        }
    }
}
