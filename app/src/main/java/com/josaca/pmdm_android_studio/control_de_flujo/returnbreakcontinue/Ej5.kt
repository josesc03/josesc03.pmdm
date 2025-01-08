package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

fun main() {
    println(contar_vocales("prueba"))
    println(contar_vocales("prueba cinco"))
    println(contar_vocales("prueba mas de cinco vocales"))

}

fun contar_vocales(cadena: String): Int {
    var vocales = "aeiou"
    var count = 0
    for (i in cadena) {
        if (vocales.contains(i)) count++
        if (count >= 5) break
    }
    return count
}