package com.josaca.pmdm_android_studio.control_de_flujo

fun main() {
    while (true) {
        try {
            println("\n---- CALIFICADOR DE NOTAS (escribe \"exit\" para salir) ----")
            print("Ingrese la nota: ")
            var nota: String = readln()
            if (nota.equals("exit")) {
                break
            }
            if (nota.toDouble() < 0 || nota.toDouble() > 10) {
                println("Tienes que introducir un numero entre 0 y 10")
            } else {
                var calificacion: String = verificarNota(nota.toDouble())
                println("La nota $nota tiene una calificacion $calificacion")
            }
        } catch (e: NumberFormatException) {
            println("Tienes que introducir un numero")
        }
        println("----------------------------------------------------------")
    }
    println("----------------------------------------------------------")
}

fun verificarNota(nota: Double): String {
    if (nota >= 9) return "Excelente"
    else if (nota >= 7) return "Notable"
    else if (nota >= 6) return "Bien"
    else if (nota >= 5) return "Suficiente"
    else return "Suspenso"
}