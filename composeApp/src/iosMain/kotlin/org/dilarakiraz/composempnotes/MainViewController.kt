package org.dilarakiraz.composempnotes

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import io.ktor.client.engine.darwin.Darwin
import org.dilarakiraz.composempnotes.app.App

fun MainViewController() = ComposeUIViewController {
    App(
        engine = remember {
            Darwin.create()
        }
    )
}