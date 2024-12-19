package org.dilarakiraz.composempnotes.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import org.dilarakiraz.composempnotes.book.data.database.DatabaseFactory
import org.dilarakiraz.composempnotes.book.data.database.FavoriteBookDatabase
import org.dilarakiraz.composempnotes.book.data.network.KtorRemoteBookDataSource
import org.dilarakiraz.composempnotes.book.data.network.RemoteBookDataSource
import org.dilarakiraz.composempnotes.book.data.repository.DefaultBookRepository
import org.dilarakiraz.composempnotes.book.domain.BookRepository
import org.dilarakiraz.composempnotes.book.presentation.SelectedBookViewModel
import org.dilarakiraz.composempnotes.book.presentation.book_detail.BookDetailViewModel
import org.dilarakiraz.composempnotes.book.presentation.book_list.BookListViewModel
import org.dilarakiraz.composempnotes.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }

    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}