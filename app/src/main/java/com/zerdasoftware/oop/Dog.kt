package com.zerdasoftware.oop

class Dog: Animal() {

    fun dogFunction(){
        super.Noise()
    }
    override fun Noise(){
        println("Hav hav...")
    }

}