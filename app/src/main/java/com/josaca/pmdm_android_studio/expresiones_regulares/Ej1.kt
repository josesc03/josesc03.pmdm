package com.josaca.pmdm_android_studio.expresiones_regulares

fun main() {
    print("Ingrese el numero a verificar: ")
    var telefono: String = readln()
    if (validarTelefono(telefono)) {
        print("Numero valido")
    } else {
        print("Numero no valido")
    }
}

fun validarTelefono(telefono: String): Boolean {
    if (telefono.matches(Regex("\\(\\d{3}\\)\\s\\d{3}-\\d{3}"))) {
        return true
    } else if (telefono.matches(Regex("\\d{3}-\\d{3}-\\d{3}"))) {
        return true
    } else if (telefono.matches(Regex("\\d{9}"))) {
        return true
    } else {
        return false
    }
}