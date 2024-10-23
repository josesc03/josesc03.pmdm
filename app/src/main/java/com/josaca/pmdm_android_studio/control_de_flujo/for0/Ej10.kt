package com.josaca.pmdm_android_studio.control_de_flujo.for0

import kotlin.system.exitProcess

fun main() {
    print("Dame un numero entero: ")
    var valor1: Int
    try {
        valor1 = readln().toInt()
    } catch (e: Exception) {
        println("ERROR: Tienes que introducir un numero entero")
        exitProcess(0)
    }
    print("Dame otro numero entero: ")
    var valor2: Int
    try {
        valor2 = readln().toInt()
    } catch (e: Exception) {
        println("ERROR: Tienes que introducir un numero entero")
        exitProcess(0)
    }

    for (i in (if (valor2 > valor1) valor1 else valor2)..(if (valor2 > valor1) valor2 else valor1)) {
        if (i % 2 == 0) {
            println(i)
        }
    }

}