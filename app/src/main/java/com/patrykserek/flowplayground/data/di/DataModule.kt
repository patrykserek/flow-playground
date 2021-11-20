package com.patrykserek.flowplayground.data.di

import com.patrykserek.flowplayground.data.persistence.DataPersistence
import com.patrykserek.flowplayground.data.persistence.InMemoryDataPersistence
import com.patrykserek.flowplayground.data.service.BackgroundService
import com.patrykserek.flowplayground.data.source.DataSource
import com.patrykserek.flowplayground.data.source.FakeDataSource
import org.koin.dsl.module

val dataModule = module {
    single<DataSource> { FakeDataSource() }
    single<DataPersistence> { InMemoryDataPersistence() }
    single { BackgroundService(get(), get()) }
}