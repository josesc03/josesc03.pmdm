package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

fun main() {
    println(sumaDigitos(9999))
    println(sumaDigitos(99))

}

fun sumaDigitos(numero: Int): Int {
    if (numero < 0) throw IllegalArgumentException("El número debe ser entero positivo")

    val numeroString = numero.toString()
    var suma = 0

    for (digito in numeroString) {
        suma += digito.digitToInt()
        if (suma > 20) break
    }
    return suma
}