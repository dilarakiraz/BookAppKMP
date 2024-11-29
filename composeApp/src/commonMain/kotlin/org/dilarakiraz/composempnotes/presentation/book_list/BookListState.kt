package org.dilarakiraz.composempnotes.presentation.book_list

import org.dilarakiraz.composempnotes.book.domain.Book
import org.dilarakiraz.composempnotes.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResult: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
