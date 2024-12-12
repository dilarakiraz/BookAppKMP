package org.dilarakiraz.composempnotes.book.presentation.book_list

import org.dilarakiraz.composempnotes.book.domain.Book
import org.dilarakiraz.composempnotes.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

