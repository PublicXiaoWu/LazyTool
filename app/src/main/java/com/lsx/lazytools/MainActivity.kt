package com.lsx.lazytools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lsx.lazytools.ext.getPrintSize

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val printSize = 99L.getPrintSize()
    }
}