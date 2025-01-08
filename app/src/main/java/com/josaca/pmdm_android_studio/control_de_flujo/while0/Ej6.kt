package com.josaca.pmdm_android_studio.control_de_flujo.while0

fun main() {
    var opcion: Int
    try {
        print("Ingrese un numero entero que no sea negativo: ")
        opcion = readln().toInt()
        if (opcion < 0) {
            println("Tienes que ingresar un numero entero no negativo")
        } else {
            println("El factorial de $opcion es: ")
            var total: Int = 1
            while (opcion > 0) {
                total *= opcion
                opcion--
            }
            print(total)
        }

    } catch (e: Exception) {
        println("Tienes que ingresar un numero entero no negativo")
    }
}