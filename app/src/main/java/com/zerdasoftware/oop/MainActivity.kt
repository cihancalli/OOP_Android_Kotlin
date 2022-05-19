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

        println("------Encapsulation------")
        val cihan = Artist("Cihan",30,"musician")
        println(cihan.name)

        println("------Inheritance------")
        val calli = CustomArtist("Cihan",30,"musician")
        println(calli.name)
        println(calli.age)
        calli.Sing()
    }
}