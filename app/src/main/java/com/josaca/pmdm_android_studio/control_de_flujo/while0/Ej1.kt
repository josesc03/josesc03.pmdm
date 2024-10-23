package com.josaca.pmdm_android_studio.control_de_flujo.while0

import kotlin.system.exitProcess

fun main() {
    print("Ingrese un valor entero positivo: ")
    var valor: Int
    try {
        valor = readln().toInt()
    } catch (e: Exception) {
        println("ERROR: Tienes que introducir un numero entero")
        exitProcess(0)
    }

    while (valor > 0) {
        println(valor)
        valor--
    }
}