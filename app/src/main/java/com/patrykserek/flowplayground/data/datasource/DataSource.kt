package com.patrykserek.flowplayground.data.datasource

import kotlinx.coroutines.flow.Flow

interface DataSource {
    fun observeNumber(): Flow<Int>
}