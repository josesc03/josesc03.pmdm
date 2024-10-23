package com.josaca.pmdm_android_studio.control_de_flujo.while0

import kotlin.system.exitProcess

fun main() {
    var valor: Int = 1
    var total: Int = 0

    while (true) {
        try {
            println("Introduce un numero entero. (para terminar ingresa un numero negativo)")
            valor = readln().toInt()
            if (valor >= 0) {
                total += valor
            } else {
                break
            }

        } catch (e: Exception) {
            println("ERROR: Tienes que introducir un numero entero")
            exitProcess(0)
        }
    }

    println(
        "----------------------------------\n" +
                " La suma total de los numeros es: \n" +
                "$total\n" +
                "----------------------------------\n"
    )
}