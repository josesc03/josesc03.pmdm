package com.josaca.pmdm_android_studio.control_de_flujo.while0

fun main() {
    var opcion: String = ""
    while (opcion != "salir") {
        println("Ingrese una palabra: (ingrese \"salir\" para terminar)")
        opcion = readln()

        if (opcion.uppercase() == opcion.reversed().uppercase()) {
            println("La palabra ingresada SI es palíndromo.")
        } else {
            println("La palabra ingresada NO es palíndromo.")
        }
    }
}