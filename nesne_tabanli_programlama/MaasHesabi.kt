package com.example.kotlindersleri1.nesne_tabanli_programlama

class MaasHesabi {
    fun main(){
        val gunSayisi = 20

        try {
            val maasSonuc = maasHesabi(gunSayisi)
            println("$gunSayisi gün calismanin maasi: $maasSonuc TL'dir.")
        } catch (e: IllegalArgumentException){
            println(e.message)
        }
    }
}