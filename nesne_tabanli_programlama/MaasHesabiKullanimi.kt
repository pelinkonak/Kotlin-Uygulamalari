package com.example.kotlindersleri1.nesne_tabanli_programlama

fun maasHesabi(gunSayisi: Int): Double {
    val calismaSaatiGunluk = 8
    val calismaSaatiUcreti = 40.0
    val mesaiSaatiUcreti = 80.0
    val mesaiSiniri = 150

    if(gunSayisi<0){
        throw IllegalArgumentException("Gun sayisi negatif olamaz.")
    }

    val calismaSaati = calismaSaatiGunluk * gunSayisi
    val maas = if (calismaSaati <= mesaiSiniri){
        calismaSaati*calismaSaatiUcreti
    } else {
        val mesaiSaati = calismaSaati- mesaiSiniri
        mesaiSiniri*calismaSaatiUcreti+mesaiSaati*mesaiSaatiUcreti
    }

    return maas
}