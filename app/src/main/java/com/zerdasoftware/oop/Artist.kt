package com.zerdasoftware.oop

open class Artist(name:String, age:Int, profession:String) {

    //Encapsulation
    private var gender:String? = ""

    var name:String? = name
        private set
        get

    var age:Int? = age
        private set
        get

    private var profession:String? = profession
}