package com.burakisik.odev4.viewModel

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class CounterViewModel: ViewModel() {

    private var counter: MutableLiveData<String>? = null

    fun getCounter(): MutableLiveData<String>? {
        if (counter == null) {
            counter = loadCounter()
        }
        return counter
    }

    private fun loadCounter(): MutableLiveData<String> {
        val liveData = MutableLiveData<String>()

        val timer = object: CountDownTimer(20000, 10) {
            override fun onTick(millisUntilFinished: Long) {
                liveData.value = millisUntilFinished.toString()
            }

            override fun onFinish() {

            }
        }
        timer.start()

        return liveData
    }
}