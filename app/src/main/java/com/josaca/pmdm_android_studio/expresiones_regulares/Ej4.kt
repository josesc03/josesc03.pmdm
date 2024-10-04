package com.josaca.pmdm_android_studio.expresiones_regulares

fun main() {
    do {
        print("Introduzca el nombre: ")
        var nombre_completo = readln()
        if (!verificarNombre(nombre_completo)) {
            println("Nombre incorrecto, vuelva a intentarlo.")
        } else {
            println("Nombre correcto.")
        }
    } while (!verificarNombre(nombre_completo))

    do {
        print("Introduzca el Email: ")
        var email = readln()
        if (!verificarEmail(email)) {
            println("Email incorrecto, vuelva a intentarlo.")
        } else {
            println("Email correcto.")
        }
    } while (!verificarEmail(email))

    do {
        print("Introduzca el DNI: ")
        var dni = readln()
        if (!verificarDNI(dni)) {
            println("DNI incorrecto, vuelva a intentarlo.")
        } else {
            println("DNI correcto.")
        }
    } while (!verificarDNI(dni))

    do {
        print("Introduzca la edad: ")
        var edad = readln()
        if (!verificarEdad(edad)) {
            println("Edad incorrecto, vuelva a intentarlo.")
        } else {
            println("Edad correcto.")
        }
    } while (!verificarEdad(edad))

    do {
        print("Introduzca el numero: ")
        var numero = readln()
        if (!verificarNumero(numero)) {
            println("Numero incorrecto, vuelva a intentarlo")
        } else {
            println("Numero correcto.")
        }
    } while (!verificarNumero(numero))
}

fun verificarNombre(nombre: String): Boolean {
    return nombre.matches(Regex("[a-zA-Z\\-\\s']{3,50}"))
}

fun verificarEmail(correo: String): Boolean {
    return correo.matches(Regex("^[\\w.]+@[\\w.]+\\.[a-zA-Z]{2,}$"))
}

fun verificarDNI(dni: String): Boolean {
    return dni.matches(Regex("\\d{7,8}[A-Z]"))
}

fun verificarEdad(edad: String): Boolean {
    return edad.matches(Regex("\\d{1,3}"))
}

fun verificarNumero(numero: String): Boolean {
    return numero.matches(Regex("[967]{1}\\d{8}")) || numero.matches(Regex("[967]{1}\\d{2}\\s\\d{3}\\s\\d{3}"))
}