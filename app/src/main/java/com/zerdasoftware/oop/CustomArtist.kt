package com.zerdasoftware.oop

class CustomArtist(name: String, age: Int, profession: String) : Artist(name, age, profession) {

    fun Sing(){
        println("is being sung")
    }
}