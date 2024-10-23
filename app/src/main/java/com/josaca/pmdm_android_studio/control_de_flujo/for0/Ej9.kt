package com.josaca.pmdm_android_studio.control_de_flujo.for0

import kotlin.system.exitProcess

fun main() {
    print("Dame un numero entero: ")
    var valor: Int
    try {
        valor = readln().toInt()
    } catch (e: Exception) {
        println("ERROR: Tienes que introducir un numero entero")
        exitProcess(0)
    }

    for (i in 1..10) {
        println("$i * $valor = ${i * valor}")
    }
}