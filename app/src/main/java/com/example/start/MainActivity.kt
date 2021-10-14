package com.example.start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        outputButton.setOnClickListener {
            val intent = Intent(this, ViewPagerFragment::class.java)
            startActivity(intent)
        }
    }
}

