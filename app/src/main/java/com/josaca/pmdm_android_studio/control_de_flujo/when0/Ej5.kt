package com.josaca.pmdm_android_studio.control_de_flujo.when0

import kotlin.system.exitProcess

fun main() {
    try {
        print("Numero1: ")
        var numero1 = readln().toInt()

        print("Numero2: ")
        var numero2 = readln().toInt()

        println("Operador: (+, -, *, /) ")
        var operador = readln()

        if (operador in "+\\-*/") {

            println(
                "$numero1 $operador $numero2 = ${
                    realizarOperacion(
                        numero1,
                        numero2,
                        operador
                    )
                }"
            )

        } else {

            println("Tiene que elegir el operador correspondiente (+,-,*,/)")

        }
    } catch (e: IllegalArgumentException) {

        println("No has introducido el operador correcto")
        exitProcess(0)

    } catch (e: Exception) {

        println("Tienes que escoger un numero entero")
        exitProcess(0)

    }
}

fun realizarOperacion(numero1: Int, numero2: Int, operador: String): Double {
    return when (operador) {

        "+" -> (numero1 + numero2).toDouble()
        "-" -> (numero1 - numero2).toDouble()
        "/" -> (numero1 / numero2).toDouble()
        "*" -> (numero1 * numero2).toDouble()
        else -> throw IllegalArgumentException("No has introducido el operador correcto")

    }
}