package com.josaca.pmdm_android_studio.control_de_flujo.when0

import kotlin.system.exitProcess

fun main() {
    println("Ingrese el mes: (1-12) ")
    var mes: Int = readln().toInt()
    if (mes > 12 || mes < 1) {
        println("Tienes que introducir un numero entre 1 y 12")
        exitProcess(0)
    }

    println("Has escogido la estacion: ${getEstacion(mes)}")
}

fun getEstacion(mes: Int): String {
    return when {
        mes in intArrayOf(12, 1, 2) -> "Invierno"
        mes in intArrayOf(3, 4, 5) -> "Primavera"
        mes in intArrayOf(6, 7, 8) -> "Verano"
        mes in intArrayOf(9, 10, 11) -> "Otoño"
        else -> "###ERROR###"
    }
}