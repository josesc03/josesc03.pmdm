package com.josaca.pmdm_android_studio.expresiones_regulares

fun main() {
    print("Ingrese la contraseña a verificar: ")
    var telefono: String = readln()
    if (validarPassword(telefono)) {
        print("La contraseña es segura")
    } else {
        print("La contraseña no es segura")
    }
}

fun validarPassword(password: String): Boolean {
    if (password.matches(Regex("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*])[A-Za-z\\d!@#$%^&*]{8,}"))) {
        return true
    } else {
        return false
    }
}