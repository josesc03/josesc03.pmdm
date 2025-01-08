package com.josaca.pmdm_android_studio.control_de_flujo.while0

import kotlin.system.exitProcess

fun main() {
    print("Ingrese el numero de potencias a realizar: ")
    var opcion: Int
    try {
        opcion = readln().toInt()
        if (opcion < 0) {
            println("Tienes que ingresar un numero entero positivo")
            exitProcess(0)
        }

        var contador = 0.0
        println("---------------------")
        while (contador <= opcion) {
            println(
                "| %17s |".format(
                    "2^${contador.toInt()} = ${
                        Math.pow(2.0, contador).toInt()
                    }"
                )
            )

            println("---------------------")
            contador++
        }

    } catch (e: Exception) {
        println("Tienes que ingresar un numero entero positivo")
        exitProcess(0)
    }
}