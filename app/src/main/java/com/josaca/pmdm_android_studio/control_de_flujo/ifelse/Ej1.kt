package com.josaca.pmdm_android_studio.control_de_flujo.ifelse

fun main() {
    var mayor: Int
    while (true) {
        try {
            print("Introduzca un primer numero entero: ")
            mayor = readln().toInt()
            break
        } catch (e: NumberFormatException) {
            println("Tienes que introducir un numero entero")
        }
    }

    var opcion: String
    while (true) {
        println("\n---- ¿Cual es mayor? (Escribe \"exit\" para salir) ----")
        print("Escoje un numero entero: ")
        opcion = readln()
        if (opcion.equals("exit")) {
            break
        }
        try {
            if (opcion.toInt() > mayor) mayor = opcion.toInt()
        } catch (e: NumberFormatException) {
            println("Tienes que introducir un numero entero")
        }
        println("El mayor es $mayor")
        println("-----------------------------------------------------")
    }
    println("-----------------------------------------------------")
}