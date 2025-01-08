package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

import kotlin.random.Random

fun main() {
    println(adivinarNumero(1, 30))
}

fun adivinarNumero(min: Int, max: Int): String {
    var intentos: Int = 5
    var numeroAleatorio: Int = Random.nextInt(min, max)
    while (true) {
        println("El numero a adivinar esta entre $min y $max. ¡Let's Go!")
        print("Intente adivinar: ")
        try {
            var numero: Int = readln().toInt()
            if (numero > max || numero < min) {
                println("Tienes que ingresar un numero entre $min y $max")
                continue
            } else {
                if (numero > numeroAleatorio) {
                    println("El numero es MENOR")
                    intentos--
                } else if (numero < numeroAleatorio) {
                    println("El numero es MAYOR")
                    intentos--
                } else
                    return "¡Has ganado! El numero aleatorio era $numero"
            }

            if (intentos <= 0) return "Has perdido... tus intentos se han agotado, el numero era $numeroAleatorio"
            else println("Te queda un total de $intentos intento/s")

        } catch (e: Exception) {
            println("Tienes que ingresar un numero entre $min y $max")
            continue
        }
    }
}