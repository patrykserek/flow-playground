package com.patrykserek.flowplayground.data.datasource

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

class FakeDataSource : DataSource {

    private val random = Random(System.currentTimeMillis())

    override fun observeNumber(): Flow<Int> = flow {
        while (true) {
            emit(random.nextInt())
            delay(1000L)
        }
    }
}
