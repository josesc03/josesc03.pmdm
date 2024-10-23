package com.josaca.pmdm_android_studio.control_de_flujo.when0

fun main() {
    println("Ingrese un caracter: (solo usará el primer caracter) ")
    var caracter: Char = readln()[0]
    print("Has introducido: ${tipoCaracter(caracter)}")
}

fun tipoCaracter(caracter: Char): String {
    return when {
        caracter.isDigit() -> "digito"
        caracter.isLetter() && caracter.isUpperCase() -> "letra mayuscula"
        caracter.isLetter() && !caracter.isUpperCase() -> "letra minuscula"
        else -> "simbolo"
    }
}