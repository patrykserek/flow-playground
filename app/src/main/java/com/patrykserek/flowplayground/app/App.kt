package com.patrykserek.flowplayground.app

import android.app.Application
import com.patrykserek.flowplayground.data.di.dataModule
import com.patrykserek.flowplayground.data.service.BackgroundService
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    private val backgroundService by inject<BackgroundService>()

    override fun onCreate() {
        super.onCreate()
        initKoin()
        backgroundService.init()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@App)
            modules(dataModule)
        }
    }
}