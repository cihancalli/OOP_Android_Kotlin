package com.zerdasoftware.oop.Inheritance

import com.zerdasoftware.oop.Encapsulation.Sanatci

class OzelSanatci(isim: String, yas: Int, meslek: String) : Sanatci(isim, yas, meslek) {

    fun sarkisoyle() {
        println("şarkı söyleniyor")
    }
}