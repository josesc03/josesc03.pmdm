package com.josaca.pmdm_android_studio.control_de_flujo.while0

fun main() {
    var password: String
    var repetirpassword: String
    var intentos: Int = 3

    do {
        if (intentos <= 0) break

        println("Ingrese la contraseña: ")
        password = readln()
        if (password.isNullOrBlank()) {
            println("La contraseña no puede estar vacia \n...")
            repetirpassword = "Error"
            intentos--
        } else {
            println("Repita la contraseña: ")
            repetirpassword = readln()
            if (repetirpassword.isNullOrBlank()) {
                println("La contraseña no puede estar vacia \n...")
                intentos--
            } else {
                if (password == repetirpassword) {
                    println("¡Las contraseñas coinciden!")
                } else {
                    println("Las contraseñas NO coinciden, vuelva a intentarlo \n...")
                    intentos--

                }
            }
        }
    } while (password != repetirpassword)
}