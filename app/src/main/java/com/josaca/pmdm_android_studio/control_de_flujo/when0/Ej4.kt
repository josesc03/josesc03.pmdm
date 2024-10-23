package com.josaca.pmdm_android_studio.control_de_flujo.when0

import kotlin.system.exitProcess

fun main() {
    try {
        println("Introduce la calificacion: (0 - 100) ")
        var calificacion = readln().toInt()
        if (calificacion > 100 || calificacion < 0) println("Tienes que escoger un numero del 0 al 100")
        else println("Usted es: " + getCalificacion(calificacion))
    } catch (e: Exception) {
        println("Tienes que escoger un numero del 0 al 100")
        exitProcess(0)
    }
}

fun getCalificacion(numero: Int): String {
    return when {
        numero < 60 -> "F"
        numero < 70 -> "D"
        numero < 80 -> "C"
        numero < 90 -> "B"
        numero <= 100 -> "A"
        else -> "###ERROR###"
    }
}