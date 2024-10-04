package com.josaca.pmdm_android_studio.fundamentos

fun main() {
    print("Programa para comparar números\n" +
            "Escribe el primero número: ")
    var primero:Double = readln().toDouble()
    print("Escribe el segundo número: ")
    var segundo:Double = readln().toDouble()
    println("Vamos a comparar el numero $primero con el numero $segundo")
    println("¿Són iguales el $primero y el $segundo? ${primero==segundo}")
    print("¿Es mayor el $primero que el $segundo? ${primero>segundo}")
}