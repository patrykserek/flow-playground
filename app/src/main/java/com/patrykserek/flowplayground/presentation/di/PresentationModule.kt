package com.patrykserek.flowplayground.presentation.di

import com.patrykserek.flowplayground.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { MainViewModel(get()) }
}