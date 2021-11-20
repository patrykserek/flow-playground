package com.patrykserek.flowplayground.domain.di

import com.patrykserek.flowplayground.domain.ObserveNumber
import org.koin.dsl.module

val domainModule = module {
    factory { ObserveNumber(get()) }
}