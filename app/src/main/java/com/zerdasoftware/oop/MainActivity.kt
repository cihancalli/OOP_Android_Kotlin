package com.zerdasoftware.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("------Classes------")
        val user = User("Cihan",30)
        val otheruser = User("Çallı",30)
    }
}