package org.dilarakiraz.composempnotes.book.presentation.book_detail

import org.dilarakiraz.composempnotes.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null,
)
