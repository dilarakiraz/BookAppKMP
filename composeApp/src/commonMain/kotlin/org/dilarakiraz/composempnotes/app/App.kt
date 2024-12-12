package org.dilarakiraz.composempnotes.app

import androidx.compose.runtime.*
import io.ktor.client.engine.HttpClientEngine
import org.dilarakiraz.composempnotes.book.data.network.KtorRemoteBookDataSource
import org.dilarakiraz.composempnotes.book.data.repository.DefaultBookRepository
import org.dilarakiraz.composempnotes.book.presentation.book_list.BookListScreenRoot
import org.dilarakiraz.composempnotes.book.presentation.book_list.BookListViewModel
import org.dilarakiraz.composempnotes.core.data.HttpClientFactory
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(engine: HttpClientEngine) {
    BookListScreenRoot(
        viewModel = remember {
            BookListViewModel(
                bookRepository = DefaultBookRepository(
                    remoteBookDataSource = KtorRemoteBookDataSource(
                        httpClient = HttpClientFactory.create(engine)
                    )
                )
            )
        },
        onBookClick = {

        }
    )
}