package org.dilarakiraz.composempnotes.di

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

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}