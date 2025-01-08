package com.josaca.pmdm_android_studio.examen

import kotlin.system.exitProcess


fun main() {
    val listaProductos: MutableList<MutableList<String>> = mutableListOf()

    registrarProductos(listaProductos) //funcion para registrar los productos
    sanitizarProductos(listaProductos) //funcion que poner los ID con un formato minuscula

    resumenProductos(listaProductos) //funcion que devuelve un resumen de los productos

    buscarProductosPorIdentificador(listaProductos) //funcion de buscar productos por el ID

    juegoAdivinarPrecio(listaProductos) //funcion del juego de adivinar el precio de un producto al azar
}

fun juegoAdivinarPrecio(listaProductos: MutableList<MutableList<String>>) {
    val productoAlAzar: MutableList<String> = listaProductos.random()
    val precioProductoAlAzar: Double = productoAlAzar[2].toDouble()

    var intento: Double

    var numeroIntentos = 0

    println("\nHemos escogido un producto al azar, intente adivinar su precio!")
    while (true) {
        print("Precio que crea: ")
        try {
            intento = readln().toDouble()
        } catch (e: NumberFormatException) {
            println("ERROR: Debes de ingresar un numero")
            continue
        }

        numeroIntentos++

        when {
            intento > precioProductoAlAzar -> println("El precio del producto es mas bajo")
            intento < precioProductoAlAzar -> println("El precio del producto es mas alto")
            intento == precioProductoAlAzar -> {
                println("¡Enhorabuena, has acertado el precio de \"${productoAlAzar[0]}\", que tenia un precio de ${productoAlAzar[2]}!")
                println("Has necesitado un total de $numeroIntentos intentos")
                break
            }

        }

    }

}

fun buscarProductosPorIdentificador(listaProductos: MutableList<MutableList<String>>) {
    var identificadorABuscar: String
    do {
        println("Ingrese el identificador del producto que quiera buscar: (para salir ingrese \"salir\")")
        print("Identificador: ")
        identificadorABuscar = readln()

        if (identificadorABuscar == "salir") break

        if (!identificadorABuscar.matches(Regex("[a-zA-Z]{3}[\\-]{1}[\\d]{4}"))) {
            println("ERROR: Identificador incorrecto, vuelve a intentarlo.\n")
            continue
        }

        var existenCoincidencias = false
        for (producto in listaProductos) {
            if (producto[1] == identificadorABuscar.lowercase()) {
                existenCoincidencias = true
                println("Nombre del producto: ${producto[0]}")
                println("Precio del producto: ${producto[2]}")
                println("Identificador del producto: ${producto[1]}")
            }
        }

        if (!existenCoincidencias) {
            println("ERROR: No existe ningun producto con ese identificador\n")
        }

    } while (true)

}

fun resumenProductos(listaProductos: MutableList<MutableList<String>>) {
    val economicos: MutableList<MutableList<String>> = mutableListOf()
    val asequibles: MutableList<MutableList<String>> = mutableListOf()
    val intermedios: MutableList<MutableList<String>> = mutableListOf()
    val lujosos: MutableList<MutableList<String>> = mutableListOf()

    var totalPrecio = 0.0

    for (producto in listaProductos) {

        totalPrecio += producto[2].toDouble()

        when {
            producto[2].toDouble() < 10 -> economicos.add(producto)
            producto[2].toDouble() <= 50 -> asequibles.add(producto)
            producto[2].toDouble() <= 100 -> intermedios.add(producto)
            producto[2].toDouble() > 100 -> lujosos.add(producto)
        }
    }

    println("El numero total de productos economicos es ${economicos.size}")
    println("El numero total de productos asequibles es ${asequibles.size}")
    println("El numero total de productos intermedios es ${intermedios.size}")
    println("El numero total de productos lujosos es ${lujosos.size}")


    println("\nEl precio promedio de todos los productos es de ${totalPrecio / listaProductos.size}")

    val masBajo: MutableList<String> = mutableListOf("", Double.MAX_VALUE.toString())
    for (producto in listaProductos) {
        if (masBajo[1].toDouble() >= producto[2].toDouble()) {
            masBajo[0] = producto[0]
            masBajo[1] = producto[2]
        }
    }

    val masAlto: MutableList<String> = mutableListOf("", Double.MIN_VALUE.toString())
    for (producto in listaProductos) {
        if (masAlto[1].toDouble() <= producto[2].toDouble()) {
            masAlto[0] = producto[0]
            masAlto[1] = producto[2]
        }
    }

    println("El precio mas bajo de todos los productos es ${masBajo[0]} con un precio de ${masBajo[1]}")
    println("El precio mas alto de todos los productos es ${masAlto[0]} con un precio de ${masAlto[1]}")

}

fun registrarProductos(listaProductos: MutableList<MutableList<String>>) {
    val numeroProductos: Int

    println("¿Cuantos productos quieres introducir? ")
    print("Numero productos: ")
    try {
        numeroProductos = readln().toInt()
    } catch (e: NumberFormatException) {
        print("ERROR: Debes introducir un numero entero.\n")
        exitProcess(1)
    }

    if (numeroProductos <= 0) {
        print("No quieres introducir ningun productos, gracias por su visita.")
        exitProcess(0)
    }

    for (i in 1..numeroProductos) {
        println("Ingrese el nombre del producto: (entre 3 y 9 caracteres, sin espacios y sin caracteres especiales)")
        print("Nombre del producto: ")
        val nombreProducto = readln()
        if (!nombreProducto.matches(Regex("[a-zA-Z0-9]{3,9}"))) {
            println("ERROR: Nombre incorrecto.\n")
            exitProcess(1)
        }

        println("Nombre introducido correctamente.\n")

        var identificadorProducto: String
        do {
            println("Ingrese el identificador del producto: (formato ABC-1234)")
            print("Identificador del producto: ")
            identificadorProducto = readln()
            if (!identificadorProducto.matches(Regex("[a-zA-Z]{3}[\\-]{1}[\\d]{4}"))) {
                println("ERROR: Identificador incorrecto, vuelve a intentarlo.\n")
            }
        } while (!identificadorProducto.matches(Regex("[a-zA-Z]{3}[\\-]{1}[\\d]{4}")))
        println("Identificador introducido correctamente.\n")

        var precioProducto: Double
        do {
            println("Ingrese el precio del producto: (numero mayor que 0)")
            print("Precio del producto: ")
            precioProducto = 0.0
            try {
                precioProducto = readln().toDouble()
            } catch (e: NumberFormatException) {
                println("ERROR: Debes introducir un numero mayor que cero.\n")
            }
        } while (precioProducto <= 0)
        println("Precio introducido correctamente.\n")

        listaProductos.add(
            mutableListOf(
                nombreProducto,
                identificadorProducto,
                precioProducto.toString()
            )
        )

    }
}

fun sanitizarProductos(listaProductos: MutableList<MutableList<String>>) {
    for (producto in listaProductos) {
        producto[2] = producto[2].uppercase()
    }
}