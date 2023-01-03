package com.zerdasoftware.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zerdasoftware.oop.Classes.Kullanici
import com.zerdasoftware.oop.Inheritance.OzelSanatci
import com.zerdasoftware.oop.Encapsulation.Sanatci
import com.zerdasoftware.oop.InterFace.Gitar
import com.zerdasoftware.oop.Polymorphism.Hayvan
import com.zerdasoftware.oop.Polymorphism.Islemler
import com.zerdasoftware.oop.Polymorphism.Kopek

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-----Sınıflar----")
        val kullanici = Kullanici("Cihan",32)
        val digerKullanici = Kullanici("Calli",91)


        println("-----Encapsulation----")
        val ahmet = Sanatci("Ahmet",50,"Müzisyen")

        println(ahmet.isim)
        //ahmet.isim = "Ahmet2"
        //println(ahmet.isim)

        println("-----Inheritance----")
        val mehmet = OzelSanatci("Mehmet",40,"Tiyatrocu")
        mehmet.sarkisoyle()

        println("-----Polymorphism----")

        //Statik Polymorphism
        val islem = Islemler()
        println(islem.carpma())
        println(islem.carpma(2,3))
        println(islem.carpma(2,3,4))


        //Dinamik Polymorphism
        val kedi = Hayvan()
        kedi.sesCikar()

        val barley = Kopek()
        barley.sesCikar()
        barley.kopekFonksiyonu()


        println("-----Abstraction & InterFace----")
        //Abstraction
        kullanici.insanFonksiyonu()

        //InterFace
        var gitar = Gitar()
        gitar.marka = "Gitar Markası"
        gitar.elektro = true

        gitar.bilgi()
        println(gitar.oda)

        println("-----Lambda Gösterimleri (Expressions)----")
        yazdigimiYazdir("test")

        val yazdigimiYazdirLambda = {verilenString : String -> println(verilenString) }
        yazdigimiYazdirLambda("test lambda")

        val carpmaIslemiLambda = {a:Int, b:Int -> a*b}
        println(carpmaIslemiLambda(6,7))

        val carpmaLambdaV2 : (Int,Int) -> Int = {a,b -> a*b}
        println(carpmaLambdaV2(6,7))

    }

    fun yazdigimiYazdir(string: String){
        println(string)
    }
}