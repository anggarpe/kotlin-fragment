package com.example.tiga

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var counter = MutableLiveData(0)
    private var count = 0

    fun increment(){
        count++
        counter.value=count
    }

    fun decrement(){
        count--
        counter.value=count
    }
}