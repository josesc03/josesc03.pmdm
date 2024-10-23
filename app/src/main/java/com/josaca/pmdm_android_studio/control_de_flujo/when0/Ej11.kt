package com.josaca.pmdm_android_studio.control_de_flujo.when0

fun main() {
    val operaciones: List<Any> = listOf(
        Suma(2, 2),
        Resta(2, 2),
        Multiplicacion(2, 2),
        Division(2, 2)
    )

    for (operacion in operaciones) {
        when (operacion) {
            is Suma -> println(operacion.suma)
            is Resta -> println(operacion.resta)
            is Multiplicacion -> println(operacion.multiplicacion)
            is Division -> println(operacion.division)
        }
    }
}

class Suma(val numero: Int, val numero2: Int) {
    val suma = numero + numero2
}

class Resta(val numero: Int, val numero2: Int) {
    val resta = numero - numero2
}

class Multiplicacion(val numero: Int, val numero2: Int) {
    val multiplicacion = numero * numero2
}

class Division(val numero: Int, val numero2: Int) {
    val division = numero / numero2
}