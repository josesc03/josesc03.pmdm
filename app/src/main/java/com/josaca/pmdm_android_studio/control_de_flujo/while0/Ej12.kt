package com.josaca.pmdm_android_studio.control_de_flujo.while0

fun main() {
    var objetivo: Double = 0.0
    print("Introduce la cantidad que quieres ahorrar: ")
    try {
        objetivo = readln().toDouble()
        if (objetivo <= 0) {
            println("Tienes que ingresar un numero mayor que 0")
            return
        }
    } catch (e: Exception) {
        print("Tienes que ingresar un numero mayor que 0")
    }

    var ahorrado = 0.0

    while (ahorrado < objetivo) {
        print("Introduce una cantidad a ahorrar: ")
        try {
            var cantidad = readln().toDouble()
            if (cantidad == null || cantidad < 0) {
                println("No se permiten cantidades negativas o valores no válidos.")
            } else {
                ahorrado += cantidad
                println("Has ahorrado un total de: $ahorrado")
            }
        } catch (e: Exception) {
            print("Tienes que ingresar un numero mayor que 0")
        }
    }

    println("¡Felicidades! Has alcanzado tu objetivo de ahorro de $objetivo.")
}
