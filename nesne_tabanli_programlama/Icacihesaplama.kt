package com.example.kotlindersleri1.nesne_tabanli_programlama

class Icacihesaplama(val kenarSayisi: Int) {
    fun Icacihesaplama(kenarSayisi: Int): Double {
        if (kenarSayisi <3 ){
            throw IllegalArgumentException("Kenar sayisi en az 3 olmali.")
        }
        val icAci = ((kenarSayisi-2)*180.0)/ kenarSayisi
        return icAci
    }

    override fun toString(): String {
        return "$kenarSayisi kenarli cokgenin her ic acisi"
    }
}