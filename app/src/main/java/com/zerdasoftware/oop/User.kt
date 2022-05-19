package com.zerdasoftware.oop

class User {

    var name:String?=null
    var age:Int?=null

    constructor(name:String,age:Int){
        this.name = name
        this.age = age
        println("constructor called")
    }

    init {
        println("init called")
    }
}