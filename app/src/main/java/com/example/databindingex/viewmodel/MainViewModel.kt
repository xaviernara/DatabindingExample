package com.example.databindingex.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val message = MutableLiveData<String>()

    fun setMessage(text: String){
        message.value = text
    }
}