package com.josaca.pmdm_android_studio.control_de_flujo

fun main() {
    while (true) {
        try {
            println("\n---- POSITIVO, NEGATIVO O CERO (escribe \"exit\" para salir) ----")
            print("Ingrese el numero: ")
            var numero: String = readln()
            if (numero.equals("exit")) {
                break
            }
            var verificador: String =
                if (numero.toInt() < 0) "Negativo" else if (numero.toInt() > 0) "Positivo" else "Cero"
            println(verificador)
        } catch (e: NumberFormatException) {
            println("Tienes que introducir un numero")
        }
        println("---------------------------------------------------------------")
    }
    println("---------------------------------------------------------------")
}