package com.patrykserek.flowplayground.presentation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.patrykserek.flowplayground.R
import com.patrykserek.flowplayground.extensions.collectNotNull
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val numberTextView = findViewById<TextView>(R.id.numberTextView)

        lifecycleScope.launch {
            viewModel.number
                .flowWithLifecycle(lifecycle)
                .collectNotNull { numberTextView.text = it.toString() }
        }
    }

}