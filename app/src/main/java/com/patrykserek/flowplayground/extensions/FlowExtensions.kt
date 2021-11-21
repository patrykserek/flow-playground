package com.patrykserek.flowplayground.extensions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filterNotNull

suspend inline fun <T : Any> Flow<T?>.collectNotNull(crossinline action: suspend (value: T) -> Unit): Unit =
    this.filterNotNull().collect(action)
