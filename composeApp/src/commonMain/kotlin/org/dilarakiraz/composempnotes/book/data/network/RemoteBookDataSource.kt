package org.dilarakiraz.composempnotes.book.data.network

import org.dilarakiraz.composempnotes.book.data.dto.BookWorkDto
import org.dilarakiraz.composempnotes.book.data.dto.SearchResponseDto
import org.dilarakiraz.composempnotes.core.domain.DataError
import org.dilarakiraz.composempnotes.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}