package com.josaca.pmdm_android_studio.control_de_flujo.while0

import kotlin.random.Random

fun main() {
    var numeroaleatorio = Random.nextInt(1, 101)
    var opcion = -1
    while (opcion != numeroaleatorio) {
        print("Intente adivinar el numero aleatorio: ")
        try {
            opcion = readln().toInt()
            if (opcion == numeroaleatorio) {
                println("¡Has adivinado el numero aleatorio!")
            } else if (opcion > numeroaleatorio) {
                println("Demasiado alto")
            } else if (opcion < numeroaleatorio) {
                println("Demasiado bajo")
            }
        } catch (e: Exception) {
            println("Tienes que ingresar un numero entero")
        }
    }
}