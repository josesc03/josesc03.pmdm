package com.josaca.pmdm_android_studio.control_de_flujo.when0

import kotlin.system.exitProcess

fun main() {

    try {
        print("Ingrese un numero entero: ")
        var numero = readln().toInt()
        println("Su numero es: " + getTipoNumero(numero))
    } catch (e: Exception) {
        println("Tienes que escoger un numero entero")
        exitProcess(0)
    }

}

fun getTipoNumero(numero: Int): String {
    return when {
        numero == 0 -> "Cero"
        numero > 0 -> "Positivo"
        else -> "Negativo"
    }
}