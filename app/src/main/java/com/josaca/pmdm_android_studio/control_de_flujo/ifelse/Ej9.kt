package com.josaca.pmdm_android_studio.control_de_flujo.ifelse

fun main() {

    var opcion1: String = pickColor()
    var opcion2: String = pickSecond(opcion1)
    var mezcla: String

    if ((opcion1.equals("Rojo") || opcion2.equals("Rojo"))) {
        if ((opcion1.equals("Azul") || opcion2.equals("Azul"))) {
            mezcla = "Magenta"
        } else {
            mezcla = "Amarillo"
        }
    } else {
        mezcla = "Cian"
    }

    println("$opcion1 y $opcion2: $mezcla")

}

fun pickSecond(opcion1: String): String {
    while (true) {
        println("Elija un color:")
        if (opcion1.equals("Rojo")) {
            println("1. Verde")
            println("2. Azul")
            var opcion = readln()

            if (opcion.equals("1")) return "Verde"
            if (opcion.equals("2")) return "Azul"

        } else if (opcion1.equals("Verde")) {
            println("1. Rojo")
            println("2. Azul")
            var opcion = readln()

            if (opcion.equals("1")) return "Rojo"
            if (opcion.equals("2")) return "Azul"

        } else if (opcion1.equals("Azul")) {
            println("1. Rojo")
            println("2. Verde")
            var opcion = readln()

            if (opcion.equals("1")) return "Rojo"
            if (opcion.equals("2")) return "Verde"
        }
    }
}

fun pickColor(): String {
    while (true) {
        println("Elija un color: ")
        println("1. Rojo")
        println("2. Verde")
        println("3. Azul")
        var opcion = readln()
        if (opcion.equals("1")) return "Rojo"
        if (opcion.equals("2")) return "Verde"
        if (opcion.equals("3")) return "Azul"
    }
}