package com.josaca.pmdm_android_studio.control_de_flujo.ifelse

import kotlin.random.Random

fun main() {
    var puntos: Int = 0
    var plantado1: Boolean = false
    var puntos2: Int = 0
    var plantado2: Boolean = false

    var turno: Boolean = true

    while (!plantado2 || !plantado1) {
        var opcion = ""
        while (!opcion.equals("S") && !opcion.equals("N")) {
            println("Numero cartas: ${if (turno) puntos else puntos2}")
            println("¿Quieres mas cartas ${if (turno) "jugador 1" else "jugador 2"}? (s/n)")
            opcion = readln().uppercase()
        }
        if (opcion.equals("S")) {
            var valorCarta = Random.nextInt(1, 11)
            if (turno) {
                puntos += valorCarta

                if (puntos > 15) {
                    plantado1 = true
                }

                if (!plantado2) turno = !turno


            } else {
                puntos2 += valorCarta

                if (puntos2 > 15) {
                    plantado2 = true
                }

                if (!plantado1) turno = !turno

            }

        } else {
            if (turno) plantado1 = true else plantado2 = true
            turno = !turno
        }

    }

    println("Puntos jugador 1: $puntos")
    println("Puntos jugador 2: $puntos2")


    if (puntos > 15 && puntos2 > 15) {
        println("Ninguno gana, empate")
    } else if (puntos == puntos2) {
        println("Ninguno gana, empate")
    } else {
        println("Gana el ${if (puntos > puntos2) "Jugador 1" else "Jugador 2"}")
    }
}