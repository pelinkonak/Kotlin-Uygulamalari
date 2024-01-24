package com.example.kotlindersleri1.nesne_tabanli_programlama

fun OtoparkUcretiHesapla(sure: Double): Double  {

    val fixSaatUcreti = 50
    val ekSaatUcreti = 10

    if(sure<0){
        throw IllegalArgumentException("Otopark suresi negatif olamaz.")
    }

    val fixSaatUcretiToplam = fixSaatUcreti
    val ekSaatUcretiToplam = if(sure>1){
        (sure-1)*ekSaatUcreti
    } else {
        0.0
    }
    val toplamUcret = fixSaatUcretiToplam + ekSaatUcretiToplam

    return toplamUcret
}