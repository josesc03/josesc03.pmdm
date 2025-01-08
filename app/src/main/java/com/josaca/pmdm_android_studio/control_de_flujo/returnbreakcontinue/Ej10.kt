package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

fun main() {
    println(contarImpares(20))
    println(contarImpares(60))
    println(contarImpares(50))
    println(contarImpares(-5))
}

fun contarImpares(numero: Int): Any {
    if (numero < 0) return "El numero ingresado no puede ser negativo"

    var conteo: Int = 0

    for (i in 1..numero) {

        if (i % 2 != 0) {
            if (i > 50) continue
            conteo++
        }

    }

    return conteo
}