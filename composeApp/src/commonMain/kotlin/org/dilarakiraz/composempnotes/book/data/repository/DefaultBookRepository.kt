package org.dilarakiraz.composempnotes.book.data.repository

import kotlinx.coroutines.flow.Flow
import org.dilarakiraz.composempnotes.book.data.mappers.toBook
import org.dilarakiraz.composempnotes.book.data.network.RemoteBookDataSource
import org.dilarakiraz.composempnotes.book.domain.Book
import org.dilarakiraz.composempnotes.book.domain.BookRepository
import org.dilarakiraz.composempnotes.core.domain.DataError
import org.dilarakiraz.composempnotes.core.domain.EmptyResult
import org.dilarakiraz.composempnotes.core.domain.Result
import org.dilarakiraz.composempnotes.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,
) : BookRepository {

    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }

    override suspend fun getBookDescription(bookId: String): Result<String?, DataError> {
        TODO("Not yet implemented")
    }

    override fun getFavoriteBooks(): Flow<List<Book>> {
        TODO("Not yet implemented")
    }

    override fun isBookFavorite(id: String): Flow<Boolean> {
        TODO("Not yet implemented")
    }

    override suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteFromFavorites(id: String) {
        TODO("Not yet implemented")
    }
}