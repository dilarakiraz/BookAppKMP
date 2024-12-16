package org.dilarakiraz.composempnotes.book.presentation.book_detail

import org.dilarakiraz.composempnotes.book.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick : BookDetailAction
    data object OnFavoriteClick : BookDetailAction
    data class OnSelectedBookChange(val book: Book) : BookDetailAction
}