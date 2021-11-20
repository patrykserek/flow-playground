package com.patrykserek.flowplayground.data.service

import com.patrykserek.flowplayground.data.persistence.DataPersistence
import com.patrykserek.flowplayground.data.source.DataSource
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class BackgroundService(
    private val dataSource: DataSource,
    private val dataPersistence: DataPersistence,
) {

    fun init() {
        dataSource.observe()
            .onEach(dataPersistence::update)
            .launchIn(GlobalScope) //Fixme: Replace with proper coroutine scope later
    }
}