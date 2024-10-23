package com.josaca.pmdm_android_studio.control_de_flujo.for0

import kotlin.system.exitProcess

fun main() {
    var valor: Int
    print("Dame un numero entero: ")
    try {
        valor = readln().toInt()
    } catch (e: Exception) {
        println("ERROR: Tienes que introducir un numero entero")
        exitProcess(0)
    }


    var counter = 0
    for (i in 0..valor) {
        for (i in 1..i) {
            print("*")
        }
        println()
    }
}