package com.josaca.pmdm_android_studio.control_de_flujo.for0

import kotlin.system.exitProcess

fun main() {
    print("Ingrese el numero de estudiantes: ")
    var numEstudiantes: Int
    try {
        numEstudiantes = readln().toInt()
    } catch (e: Exception) {
        println("ERROR: Tienes que introducir un numero entero")
        exitProcess(0)
    }

    var listaEstudiantes: MutableMap<String, Double> = mutableMapOf()

    for (i in 1..numEstudiantes) {

        println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n")


        print("Ingrese el nombre del estudiante: ")
        var nombre = readln()
        print("Ingrese la calificacion del estudiante (0 - 10): ")
        var calificacion: Double
        try {
            calificacion = readln().toDouble()
            if (calificacion > 10.0 || calificacion < 0.0) {
                println("ERROR: Tienes que introducir un numero")
                exitProcess(0)
            }
        } catch (e: Exception) {
            println("ERROR: Tienes que introducir un numero")
            exitProcess(0)
        }

        listaEstudiantes.put(nombre, calificacion)

    }

    var total: Double = 0.0

    var masBaja: MutableList<Any> = mutableListOf(10.0, "null")
    var masAlta: MutableList<Any> = mutableListOf(0.0, "null")
    var perfecto: MutableList<Any> = mutableListOf()

    for (estudiante in listaEstudiantes) {
        total += estudiante.value
        if (estudiante.value >= masAlta[0] as Double) {
            if (estudiante.value == masAlta[0] as Double) {
                masAlta.add(estudiante.key)
            } else {
                masAlta.clear()
                masAlta.add(estudiante.value)
                masAlta.add(estudiante.key)
            }


            if (estudiante.value == 10.0) {
                perfecto.add(estudiante.key)
            }

        } else if (estudiante.value <= masBaja[0] as Double) {
            if (estudiante.value == masBaja[0] as Double) {
                masBaja.add(estudiante.key)
            } else {
                masBaja.clear()
                masBaja.add(estudiante.value)
                masBaja.add(estudiante.key)
            }
        }
    }


    var promedio: Double = total / listaEstudiantes.size

    println("\n- - - - - - - - - - - - - - PROMEDIO DEL CURSO - - - - - - - - - - - - - - -\n")


    println("El promedio del curso es $promedio")

    println("\n- - - - - - - - - - - - - - CALIFICACION MAS ALTA - - - - - - - - - - - - - - -\n")


    println(
        "El o los estudiantes con la calificacion mas alta son ${
            masAlta.subList(
                1,
                masAlta.size
            ).joinToString(", ")
        } con un ${masAlta[0]}, ¡seguid así!"
    )

    println("\n- - - - - - - - - - - - - - CALIFICACION MAS BAJA - - - - - - - - - - - - - - -\n")


    println(
        "El o los estudiantes con la calificacion mas baja son ${
            masBaja.subList(
                1,
                masBaja.size
            ).joinToString(", ")
        } con un ${masBaja[0]}, teneis que estudiar más"
    )

    if (perfecto.isNotEmpty()) {
        println("\n- - - - - - - - - - - - - - CALIFICACION PERFECTA - - - - - - - - - - - - - - -\n")

        println("¡Felicitaciones $perfecto obtuviste calificacion perfecta!")
    }
}