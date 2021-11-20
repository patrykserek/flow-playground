package com.patrykserek.flowplayground.data.persistence

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow

class InMemoryDataPersistence : DataPersistence {

    private val sharedFlow = MutableSharedFlow<Int>(
        replay = 1,
        extraBufferCapacity = 1,
        onBufferOverflow = BufferOverflow.DROP_OLDEST,
    )

    override fun observe(): Flow<Int> = sharedFlow

    override fun update(value: Int) {
        sharedFlow.tryEmit(value)
    }
}