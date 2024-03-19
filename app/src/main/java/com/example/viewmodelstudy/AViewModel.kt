package com.example.viewmodelstudy

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AViewModel @Inject constructor(): ViewModel() {

    init {
        Log.e("AViewModel", "AViewModel created")
    }
}
