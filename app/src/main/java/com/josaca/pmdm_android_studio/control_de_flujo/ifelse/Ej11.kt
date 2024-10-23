package com.josaca.pmdm_android_studio.control_de_flujo.ifelse

import kotlin.system.exitProcess

fun main() {

    var ganador: Boolean = true // true jugador1 false jugador2

    var opcion1: String
    println("Escoja piedra, papel o tijera")
    println("1. Piedra")
    println("2. Papel")
    println("3. Tijera")
    opcion1 = readln()

    if (!opcion1.equals("1") && !opcion1.equals("2") && !opcion1.equals("3")) {
        println("Debes introducir un numero entre 1 y 3")
        exitProcess(0)
    }

    println("Debes introducir un numero entre 1 y 3")
    var opcion2: String
    println("Escoja piedra, papel o tijera")
    println("1. Piedra")
    println("2. Papel")
    println("3. Tijera")
    opcion2 = readln()

    if (!opcion2.equals("1") && !opcion2.equals("2") && !opcion2.equals("3")) {
        println("Debes introducir un numero entre 1 y 3")
        exitProcess(0)
    }

    if (opcion1.equals("1") && opcion2.equals("3")) ganador = true else
        if (opcion1.equals("2") && opcion2.equals("1")) ganador = true else
            if (opcion1.equals("3") && opcion2.equals("2")) ganador = true else ganador = false

    println("Ha ganado el jugador ${if (ganador) "1" else "2"}")

}