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
}
