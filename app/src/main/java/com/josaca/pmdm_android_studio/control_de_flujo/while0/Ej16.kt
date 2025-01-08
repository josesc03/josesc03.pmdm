package com.josaca.pmdm_android_studio.control_de_flujo.while0

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    print("¿Cuántas sumas necesitas acertar para terminar? ")
    val aciertosNecesarios: Int
    try {
        aciertosNecesarios = readln().toInt()
        if (aciertosNecesarios < 1) {
            println("Tienes que introducir un numero mayor que 0")
            exitProcess(0)
        }
    } catch (e: Exception) {
        println("Tienes que introducir un numero entero")
        exitProcess(0)
    }
    var aciertos = 0
    var intentos = 0

    while (aciertos < aciertosNecesarios) {
        val num1 = Random.nextInt(1, 101)
        val num2 = Random.nextInt(1, 101)
        val resultadoCorrecto = num1 + num2

        print("¿Cuánto es $num1 + $num2? ")
        val respuestaUsuario = readLine()?.toIntOrNull()

        if (respuestaUsuario == resultadoCorrecto) {
            println("¡Correcto!")
            aciertos++
        } else {
            println("Incorrecto. La respuesta correcta es $resultadoCorrecto.")
        }

        intentos++
    }

    println("¡Bien hecho! Has terminado con $intentos intentos.")
}
