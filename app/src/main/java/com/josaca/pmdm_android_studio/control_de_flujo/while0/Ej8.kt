package com.josaca.pmdm_android_studio.control_de_flujo.while0

import kotlin.random.Random

fun main() {

    var dado: Int
    var dado2: Int

    while (true) {
        dado = Random.nextInt(1, 7)
        dado2 = Random.nextInt(1, 7)

        println("Tu ultima tirada ha sido $dado, $dado2")

        var opcion: String = ""
        while (opcion != "N" && opcion != "S") {
            println("¿Quieres seguir? S/N")
            opcion = readln().uppercase()

            if (opcion != "N" && opcion != "S") {
                println("¡Selecciona la opcion correcta!")
            }
        }

        if (opcion == "N") {
            println("¡Saliendo!")
            break
        }

        println("¡Volviendo a tirar!")

    }

}