package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

fun main() {
    for (i in 1..100) {
        println("$i ${if (esPrimo(i)) "es primo" else "no es primo"}")
    }
}

fun esPrimo(numero: Int): Boolean {
    var primo: Boolean = true;
    if (numero <= 1) return false
    for (i in 2..<numero) {
        if (numero % i == 0) {
            primo = false
            break
        }
    }
    return primo
}