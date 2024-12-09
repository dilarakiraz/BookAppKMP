package org.dilarakiraz.composempnotes

import androidx.compose.runtime.*
import org.dilarakiraz.composempnotes.presentation.book_list.BookListScreenRoot
import org.dilarakiraz.composempnotes.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    BookListScreenRoot (
        viewModel = remember { BookListViewModel() },
        onBookClick = {

        }
    )
}