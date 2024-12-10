package org.dilarakiraz.composempnotes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import org.dilarakiraz.composempnotes.book.domain.Book
import org.dilarakiraz.composempnotes.book.presentation.book_list.BookListScreen
import org.dilarakiraz.composempnotes.book.presentation.book_list.BookListScreenRoot
import org.dilarakiraz.composempnotes.book.presentation.book_list.BookListState
import org.dilarakiraz.composempnotes.book.presentation.book_list.books
import org.dilarakiraz.composempnotes.book.presentation.book_list.components.BookSearchBar

@Preview
@Composable
private fun BookSearchBarPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}



@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResult = books
        ),
        onAction = {}
    )
}