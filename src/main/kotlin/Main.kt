package org.example


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


fun fahrenheitDonustur(derece: Double): Double {
    return derece * 1.8 + 32
}

fun cevre(kenar1: Int, kenar2: Int): Int {
    return 2 * (kenar1 + kenar2)
}

fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

fun aHarfSayi(kelime: String): Int {
    var sayac = 0
    for (harf in kelime) {
        if (harf.lowercaseChar() == 'a') {
            sayac++
        }
    }
    return sayac
}
fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun maasHesapla(gunSayisi: Int): Int {
    val calismaSaatUcreti: Int = 10
    val mesaiSaatUcreti: Int = 20
    val gunlukCalismaSaati: Int = 8
    val toplamSaat: Int = gunSayisi * gunlukCalismaSaati
    return if (toplamSaat <= 160) {
        toplamSaat * calismaSaatUcreti
    } else {
        val mesaiSaati: Int = toplamSaat - 160
        (160 * calismaSaatUcreti) + (mesaiSaati * mesaiSaatUcreti)
    }
}

fun kotaUcretiHesapla(kota: Int): Int {
    val normalUcret: Int = 100
    val ekstraGBUcret: Int = 4
    return if (kota <= 50) {
        normalUcret
    } else {
        val ekstraKota: Int = kota - 50
        normalUcret + (ekstraKota * ekstraGBUcret)
    }
}

fun main() {
    println("Dereceyi giriniz:")
    val derece = readLine()?.toDoubleOrNull() ?: 0.0
    println("Fahrenheit: ${fahrenheitDonustur(derece)}")

    println("Dikdörtgenin 1. kenarını giriniz:")
    val kenar1 = readLine()?.toIntOrNull() ?: 0
    println("Dikdörtgenin 2. kenarını giriniz:")
    val kenar2 = readLine()?.toIntOrNull() ?: 0
    println("çevresi: ${cevre(kenar1, kenar2)}")

    println("Faktöriyelini almak istediğiniz sayıyı giriniz:")
    val sayi = readLine()?.toIntOrNull() ?: 0
    println("Faktöriyel: ${faktoriyel(sayi)}")

    println("Bir kelime giriniz:")
    val kelime = readLine() ?: ""
    println("Kelime içindeki a harfi sayisi: ${aHarfSayi(kelime)}")

    println("-------------------------------------------")
    //odevsayfa2
    println("Çokgenin kenar sayısını giriniz:")
    val kenarSayisi: Int = readLine()?.toIntOrNull() ?: 0
    println("İç açılar toplamı: ${icAciToplami(kenarSayisi)} derece")

    println("Çalışılan gün sayısını giriniz:")
    val gunSayisi: Int = readLine()?.toIntOrNull() ?: 0
    println("Toplam maaş: ${maasHesapla(gunSayisi)} ₺")

    println("Kullanılan kota miktarını (GB) giriniz:")
    val kota: Int = readLine()?.toIntOrNull() ?: 0
    println("Toplam internet ücreti: ${kotaUcretiHesapla(kota)} ₺")
}
