package com.josaca.pmdm_android_studio.control_de_flujo.when0

import kotlin.system.exitProcess


fun main() {

    try {
        print("Introduce un numero del 1 al 7 para ver que dia de la semana es: (1 - 7) ")
        var dia = readln().toInt()
        if (dia > 7 || dia < 0) println("Tienes que escoger un numero del 1 al 7")
        else println("Hoy es: " + getdia(dia))
    } catch (e: Exception) {
        print("Tienes que escoger un numero del 1 al 7")
        exitProcess(0)
    }

}

fun getdia(num: Int): String {

    return when (num) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "###ERROR###"
    }

}