package com.josaca.pmdm_android_studio.control_de_flujo.ifelse

fun main() {
    while (true) {
        println("\n---- VERIFICADOR DE PARES (escribe \"exit\" para salir) ----")
        print("Introduzca un numero: ")
        try {
            var opcion: String = readln()
            if (opcion.equals("exit")) break
            var numero: Int = opcion.toInt()
            if (numero % 2 == 0) {
                println("El numero $numero es par")
            } else {
                println("El numero $numero es impar")
            }
        } catch (e: NumberFormatException) {
            println("Debe ingresar un numero entero")
        }
        println("----------------------------------------------------------")
    }
    println("----------------------------------------------------------")


}