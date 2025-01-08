package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

fun main() {
    println(buscar_caracter("buenos dias", 'i'))
    println(buscar_caracter("buenos dias", 'l'))
}

fun buscar_caracter(cadena: String, caracter: Char): Any {
    for (i in 0..<cadena.length) {
        if (cadena[i] == caracter) return i
    }
    return "No se ha encontrado el caracter en la cadena"
}