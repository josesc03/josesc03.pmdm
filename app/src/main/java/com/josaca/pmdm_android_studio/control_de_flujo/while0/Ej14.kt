package com.josaca.pmdm_android_studio.control_de_flujo.while0

import kotlin.random.Random

fun main() {
    val limite = 20
    var puntuacionJugador1 = 0
    var puntuacionJugador2 = 0
    var continuar: Boolean
    var turno = true  // true para Jugador 1, false para Jugador 2

    println("¡Bienvenidos al juego! El límite es $limite.")
    println("El jugador que consiga la puntuación más alta sin pasarse de $limite gana.\n")

    while (true) {
        val jugador = if (turno) "Jugador 1" else "Jugador 2"
        var puntuacion = if (turno) puntuacionJugador1 else puntuacionJugador2

        println("Turno del $jugador")
        continuar = true
        while (continuar) {
            val dado = Random.nextInt(1, 7)
            println("Has sacado un $dado.")
            puntuacion += dado

            if (puntuacion > limite) {
                println("¡Te has pasado! Tu puntuación es $puntuacion, has perdido este turno.")
                puntuacion = 0
                break
            }

            print("Tu puntuación es $puntuacion. ¿Quieres tirar de nuevo? (s/n): ")
            continuar = readLine()?.lowercase() == "s"
        }

        if (turno) puntuacionJugador1 = puntuacion else puntuacionJugador2 = puntuacion

        println("Puntuación final del $jugador: $puntuacion\n")

        if (!turno) break

        turno = !turno
    }

    if (puntuacionJugador1 == puntuacionJugador2) {
        println("¡Es un empate!")
    } else if (puntuacionJugador1 > puntuacionJugador2) {
        println("¡El Jugador 1 gana con $puntuacionJugador1 puntos!")
    } else {
        println("¡El Jugador 2 gana con $puntuacionJugador2 puntos!")
    }
}
