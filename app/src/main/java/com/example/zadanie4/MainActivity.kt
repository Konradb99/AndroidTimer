package com.example.zadanie4

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var orientation=resources.getConfiguration().orientation
        when(orientation) {
            Configuration.ORIENTATION_LANDSCAPE -> setContentView(R.layout.activity_main_landscape)
            Configuration.ORIENTATION_PORTRAIT -> setContentView(R.layout.activity_main_portait)
        }
    }
}