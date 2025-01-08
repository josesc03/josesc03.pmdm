package com.josaca.pmdm_android_studio.control_de_flujo.while0

fun main() {
    val numbers = mutableListOf<Double>()
    var input: String?


    do {
        print("Introduce un número: (exit para finalizar) ")
        input = readln()

        if (input != null && input.lowercase() != "exit") {
            try {
                val number = input.toDouble()
                numbers.add(number)
            } catch (e: NumberFormatException) {
                println("Tienes que ingresar un numero.")
            }
        }
    } while (input != null && input.lowercase() != "exit")

    if (numbers.isNotEmpty()) {
        val average = numbers.average()
        println("El promedio de los numeros es: $average")
    } else {
        println("No ingresaste ningun número.")
    }
}
