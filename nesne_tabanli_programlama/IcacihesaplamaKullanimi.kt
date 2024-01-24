package com.example.kotlindersleri1.nesne_tabanli_programlama

fun main(){
       val kenarSayisi = 5

    try {
        val hesapla = Icacihesaplama(kenarSayisi)
        val icAci = hesapla.Icacihesaplama(kenarSayisi)
        println("$hesapla: $icAci derece")

    } catch (e: IllegalArgumentException){
        println(e.message)
    }
}