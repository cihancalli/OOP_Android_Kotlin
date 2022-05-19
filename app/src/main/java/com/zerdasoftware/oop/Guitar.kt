package com.zerdasoftware.oop

class Guitar : Instrument, Decoration {
    var brand:String? = null
    var electro:Boolean? = null

    override var Room: String
        get() = "Hall"
        set(value) {}
}