package com.josaca.pmdm_android_studio.control_de_flujo.for0

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    print("Ingrese el numero de operaciones a plantear: ")
    var valor: Int
    try {
        valor = readln().toInt()
    } catch (e: Exception) {
        println("ERROR: Tienes que introducir un numero entero")
        exitProcess(0)
    }

    var respuestas_correctas_counter: Int = 0

    var primeros: ArrayList<Double> = arrayListOf()
    for (i in 1..valor) {
        primeros.add(Random.nextInt(2, 10).toDouble())
    }

    var segundos: ArrayList<Double> = arrayListOf()
    for (i in 1..valor) {
        segundos.add(Random.nextInt(2, 10).toDouble())
    }

    var operaciones: ArrayList<String> = arrayListOf()

    for (i in 0 until valor) {
        when (Random.nextInt(1, 3)) { // Cambia 4 a 5 para incluir el caso de división
            1 -> operaciones.add("+")
            2 -> operaciones.add("-")
        }

        print("Cuanto es ${primeros[i]} ${operaciones[i]} ${segundos[i]}: ")
        var respuesta: Double
        try {
            respuesta = readln().toDouble()
        } catch (e: Exception) {
            println("ERROR: Tienes que introducir un numero")
            exitProcess(0)
        }

        when (operaciones[i]) {
            "+" -> {
                if (respuesta == primeros[i] + segundos[i]) {
                    println("¡Respuesta correcta! +1 punto")
                    respuestas_correctas_counter++
                } else {
                    println("Respuesta incorrecta...")
                }
            }

            "-" -> {
                if (respuesta == primeros[i] - segundos[i]) {
                    println("¡Respuesta correcta! +1 punto")
                    respuestas_correctas_counter++
                } else {
                    println("Respuesta incorrecta...")
                }
            }
        }
    }


    var nota: Double = respuestas_correctas_counter.toDouble() / valor.toDouble() * 10.0

    println(String.format("Has sacado un %.2f.", nota))
    if (nota >= 9) {
        print("¡Felicidades!")
    }
}