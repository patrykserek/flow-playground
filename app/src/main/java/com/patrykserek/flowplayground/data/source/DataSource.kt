package com.patrykserek.flowplayground.data.source

import kotlinx.coroutines.flow.Flow

interface DataSource {
    fun observe(): Flow<Int>
}