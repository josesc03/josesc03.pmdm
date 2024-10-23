package com.josaca.pmdm_android_studio.control_de_flujo.for0

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    print("Ingrese el numero de multiplicaciones a plantear: ")
    var valor: Int
    try {
        valor = readln().toInt()
    } catch (e: Exception) {
        println("ERROR: Tienes que introducir un numero entero")
        exitProcess(0)
    }

    var respuestas_correctas_counter: Int = 0

    var primeros: ArrayList<Int> = arrayListOf()
    for (i in 1..valor) {
        primeros.add(Random.nextInt(2, 10))
    }

    var segundos: ArrayList<Int> = arrayListOf()
    for (i in 1..valor) {
        segundos.add(Random.nextInt(2, 10))
    }

    for (i in 0..valor - 1) {
        print("Cuanto es ${primeros[i]} * ${segundos[i]}: ")
        var respuesta: Int
        try {
            respuesta = readln().toInt()
        } catch (e: Exception) {
            println("ERROR: Tienes que introducir un numero entero")
            exitProcess(0)
        }

        if (respuesta == primeros[i] * segundos[i]) {
            println("¡Respuesta correcta! +1 punto")
            respuestas_correctas_counter++
        } else {
            println("Respuesta incorrecta...")
        }
    }

    var nota: Double = respuestas_correctas_counter.toDouble() / valor.toDouble() * 10.0

    println(String.format("Has sacado un %.2f.", nota))
    if (nota >= 9) {
        print("¡Felicidades!")
    }
}