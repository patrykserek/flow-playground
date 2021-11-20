package com.patrykserek.flowplayground.presentation

import androidx.appcompat.app.AppCompatActivity
import com.patrykserek.flowplayground.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel by viewModel<MainViewModel>()

}