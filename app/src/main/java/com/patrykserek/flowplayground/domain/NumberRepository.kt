package com.patrykserek.flowplayground.domain

import kotlinx.coroutines.flow.Flow

interface NumberRepository {
    fun observe(): Flow<Int>
}