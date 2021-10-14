package com.example.start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.day_calculator.*

class ViewPagerFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day_calculator)

        btnClose.setOnClickListener {
            finish()
        }
    }
}