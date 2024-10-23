package com.josaca.pmdm_android_studio.control_de_flujo.when0

import kotlin.system.exitProcess

fun main() {

    try {
        println("¿Que edad tienes? (0 - 122) ")
        var edad = readln().toInt()
        if (edad > 122 || edad < 0) println("Tienes que escoger un numero del 0 al 122")
        else println("Usted es: " + getFranja(edad))
    } catch (e: Exception) {
        println("Tienes que escoger un numero del 0 al 122")
        exitProcess(0)
    }

}

fun getFranja(edad: Int): String {
    return when {
        edad >= 0 && edad <= 12 -> "Niño"
        edad >= 13 && edad <= 17 -> "Adolescente"
        edad >= 18 && edad <= 64 -> "Adulto"
        edad > 64 -> "Mayor"
        else -> "Usted no ha nacido"
    }
}