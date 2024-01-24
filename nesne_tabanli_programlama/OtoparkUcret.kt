package com.example.kotlindersleri1.nesne_tabanli_programlama

class OtoparkUcret {
    fun main() {
        val parkSuresi = 5.0

        try {
            val ucretSonuc = OtoparkUcretiHesapla(parkSuresi)
            println("$parkSuresi saatlik otopark ücreti: $ucretSonuc TL'dir. Iyi günler dileriz. ")

        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}
