package com.burakisik.odev4.ui.live

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.burakisik.odev4.R
import com.burakisik.odev4.viewModel.CounterViewModel

class CounterWatcherActivity : AppCompatActivity() {

    private val tvCounter by lazy { findViewById<TextView>(R.id.counter) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter_watcher)
        val viewModel = CounterViewModel()
        viewModel.getCounter()!!.observe(this) { counter: String ->
            tvCounter.text = counter
        }
    }
}