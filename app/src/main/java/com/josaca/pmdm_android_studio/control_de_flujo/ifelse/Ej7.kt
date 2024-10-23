package com.josaca.pmdm_android_studio.control_de_flujo.ifelse

fun main() {
    println("---- Verificador de grupo ----")
    print("Ingrese tu nombre: ")
    var nombre: String = readln()
    var sexo: String = ""
    while (true) {
        print("Ingrese su sexo (F para mujer, M para hombre): ")
        sexo = readln()
        if (sexo.uppercase() == "F" || sexo.uppercase() == "M") break
        else println("Debes seleccionar F o M")
    }
    when {
        (sexo.uppercase() == "F" && nombre.uppercase() < "M") -> println("Su grupo es el A")
        (sexo.uppercase() == "M" && nombre.uppercase() > "N") -> println("Su grupo es el A")
        else -> println("Su grupo es el B")
    }

    println("------------------------------")
}