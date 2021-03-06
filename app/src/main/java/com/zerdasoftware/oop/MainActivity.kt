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

        println("------Polymorphism------")

        //Static Polymorphism
        val process = Processes()
        println(process.multiplication())
        println(process.multiplication(2,3))
        println(process.multiplication(2,3,4))

        //Dynamic Polymorphism
        val dog = Dog()
        dog.Noise()
        dog.dogFunction()

        val cat = Animal()
        cat.Noise()

        println("------Abstraction & Interface ------")
        user.humanFunction()
        var guitar = Guitar()
        guitar.brand = "Guitar Brand"
        guitar.electro = true
        guitar.info()
        println(guitar.Room)

        println("------Lambda Expressions ------")
        PrintText("Test")

        val PrintTextLambda = {setString:String -> println(setString)}
        PrintTextLambda("Test Lambda")

        var multiplicationLambda = {a:Int,b:Int -> a*b}
        println(multiplicationLambda(7,9))
        var multiplicationLambdaV2 :(Int,Int)->Int = {a,b -> a*b}
        println(multiplicationLambdaV2(12,9))

    }

    fun PrintText(string: String){
        println(string)
    }
}