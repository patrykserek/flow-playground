package com.patrykserek.flowplayground.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.patrykserek.flowplayground.domain.ObserveNumber
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class MainViewModel(
    observeNumber: ObserveNumber,
) : ViewModel() {

    val number: StateFlow<Int?> = observeNumber()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(),
            initialValue = null,
        )
}