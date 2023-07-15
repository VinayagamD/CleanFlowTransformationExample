package com.vinaylogics.cleanflowtransformationexample

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainViewModel : ViewModel() {

    private val user = MutableStateFlow<User?>(null)

    init {

    }
}