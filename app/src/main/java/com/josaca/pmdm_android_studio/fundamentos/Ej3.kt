package com.josaca.pmdm_android_studio.fundamentos

fun main() {
    print("Programa que analiza una palabra\nEscribe una palabra: ")
    var palabra:String = readln()
    if (palabra.count() < 2) {
        print("La palabra es demasiado corta para el analisis")
    } else {
        print("La palabra $palabra tiene ${palabra.count()} caracteres.\n" +
                "La primera letra es ${palabra.first()}\n" +
                "La última letra es ${palabra.last()}\n" +
                "Las dos primeras letras son ${palabra.take(2)}\n" +
                "Las dos ultimas letras son ${palabra.takeLast(2)}")
    }
}