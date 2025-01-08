package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

fun main() {
    println(factorial(-1))
    println(factorial(5))
    println(factorial(11))

}

fun factorial(numero: Int): Any {
    var total: Int = 1

    if (numero < 0) return "Tienes que introducir un numero entero positivo"

    for (i in numero downTo 1) {
        if (total * i > 10000) return "El cálculo del factorial ha excedido 10000."
        total *= i
    }

    return total
}