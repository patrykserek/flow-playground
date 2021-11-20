package com.patrykserek.flowplayground.data.persistence

import kotlinx.coroutines.flow.Flow

interface DataPersistence {
    fun observe(): Flow<Int>
    fun update(value: Int)
}