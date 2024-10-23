package com.josaca.pmdm_android_studio.control_de_flujo.for0

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    print("Ingrese el numero de dados a tirar: ")
    var numdados: Int
    try {
        numdados = readln().toInt()
    } catch (e: Exception) {
        println("ERROR: Tienes que introducir un numero entero")
        exitProcess(0)
    }

    var jugador1: ArrayList<Int> = arrayListOf()
    var jugador2: ArrayList<Int> = arrayListOf()

    for (i in 1..numdados) {
        jugador1.add(Random.nextInt(1, 6))
        jugador2.add(Random.nextInt(1, 6))
    }

    var puntuacion1 = 0
    puntuacion1 = jugador1.max() + jugador1.min()

    var puntuacion2 = 0
    puntuacion2 = jugador2.max() + jugador2.min()

    println("El jugador 1 ha sacado los siguientes valores: $jugador1 \nValor mas alto: ${jugador1.max()}, Valor mas bajo: ${jugador1.min()} (Total: $puntuacion1)")
    println("El jugador 1 ha sacado los siguientes valores: $jugador2 \nValor mas alto: ${jugador2.max()}, Valor mas bajo: ${jugador2.min()} (Total: $puntuacion1)")
    if (puntuacion1 > puntuacion2) println("¡El jugador 1 gana!")
    else if (puntuacion2 > puntuacion1) println("¡El jugador 2 gana!")
    else println("¡Habeis quedado empate!")
}