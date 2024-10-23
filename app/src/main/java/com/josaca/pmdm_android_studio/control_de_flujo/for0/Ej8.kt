package com.josaca.pmdm_android_studio.control_de_flujo.for0

fun main() {
    print("Ingrese una cadena: ")
    var cadena = readln()

    var vocales: List<Char> = listOf('a', 'e', 'i', 'o', 'u')

    var counter = 0
    for (char in cadena) {
        if (char in vocales)
            counter++
    }

    print("Su cadena $cadena tiene $counter vocales")
}