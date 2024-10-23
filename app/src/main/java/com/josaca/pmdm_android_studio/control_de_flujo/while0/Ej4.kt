package com.josaca.pmdm_android_studio.control_de_flujo.while0

import kotlin.system.exitProcess

fun main() {
    var valor: Int
    try {
        print("Ingrese el numero a multiplicar: ")
        valor = readln().toInt()
    } catch (e: Exception) {
        println("ERROR: Tienes que introducir un numero entero")
        exitProcess(0)
    }

    var counter: Int = 0

    while (counter < 10) {
        counter++
        println("$valor * $counter = ${valor * counter}")
    }
}