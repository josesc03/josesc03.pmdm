package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

fun main() {
    println(encontrar_par(3))
    println(encontrar_par(1))


}

fun encontrar_par(numero: Int): Any {
    if (numero < 1) return "El número debe ser entero positivo"
    for (i in 1..numero) {
        if (i % 2 == 0) return i
    }
    return "No hay números pares entre 1 y $numero"

}