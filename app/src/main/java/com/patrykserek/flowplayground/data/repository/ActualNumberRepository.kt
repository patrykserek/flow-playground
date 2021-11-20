package com.patrykserek.flowplayground.data.repository

import com.patrykserek.flowplayground.data.persistence.DataPersistence
import com.patrykserek.flowplayground.domain.NumberRepository
import kotlinx.coroutines.flow.Flow

class ActualNumberRepository(
    private val dataPersistence: DataPersistence,
) : NumberRepository {

    override fun observe(): Flow<Int> = dataPersistence.observe()

}