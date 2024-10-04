package com.josaca.pmdm_android_studio.expresiones_regulares

fun main() {
    print("Ingrese el correo a verificar: ")
    var correo: String = readln()
    if (validarCorreo(correo)) {
        print("Correo valido")
    } else {
        print("Correo no valido")
    }
}

fun validarCorreo(correo: String): Boolean {
    if (correo.matches(Regex("^[\\w.]+@[\\w.]+\\.[a-zA-Z]{2,}$"))) {
        return true
    } else {
        return false
    }
}