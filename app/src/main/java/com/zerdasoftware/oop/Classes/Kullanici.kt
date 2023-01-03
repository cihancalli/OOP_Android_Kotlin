package com.zerdasoftware.oop.Classes

import com.zerdasoftware.oop.Abstraction.Insan

class Kullanici : Insan {

    var isim: String? = null
    var yas: Int? = null

    constructor(isim:String,yas:Int){
        this.isim = isim
        this.yas = yas
        println("constructor çağırıldı")
    }

    init {
        println("init çağırıldı")
    }
}