package org.dilarakiraz.composempnotes

import android.app.Application
import org.dilarakiraz.composempnotes.di.initKoin
import org.koin.android.ext.koin.androidContext

class BookApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookApplication)
        }
    }
}