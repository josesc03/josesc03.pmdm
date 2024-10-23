package com.josaca.pmdm_android_studio.control_de_flujo.ifelse

fun main() {
    var password: String = "password"
    while (true) {
        try {
            println("\n---- ¿Cual es tu contraseña? (escribe \"exit\" para salir) ----")
            print("Ingrese la contraseña: ")
            var intento: String = readln()
            if (intento.equals("exit")) {
                break
            }
            if (intento.equals(password, ignoreCase = true)) {
                println("Contraseña correcta")
                break
            } else {
                println("Contraseña incorrecta, por favor, vuelva a intentarlo")
            }

        } catch (e: NumberFormatException) {
            println("Tienes que introducir un numero")
        }
        println("-------------------------------------------------------------")
    }
    println("-------------------------------------------------------------")

}