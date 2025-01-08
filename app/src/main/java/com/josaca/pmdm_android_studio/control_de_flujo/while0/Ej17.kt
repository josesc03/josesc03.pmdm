package com.josaca.pmdm_android_studio.control_de_flujo.while0

import kotlin.system.exitProcess

fun main() {
    println("Piensa en un número y dime entre qué números está")
    print("Valor minimo: ")
    var minimo: Int = 0
    try {
        minimo = readln().toInt()
    } catch (e: Exception) {
        println("Tienes que ingresar un numero entero")
        exitProcess(0)
    }
    print("Valor maximo: ")
    var maximo: Int = 0
    try {
        maximo = readln().toInt()
        if (maximo < minimo) {
            println("El numero maximo no puede ser menor al numero minimo")
            exitProcess(0)
        }
    } catch (e: Exception) {
        println("Tienes que ingresar un numero entero")
        exitProcess(0)
    }
    println("Voy a intentar adivinar el número")

    var intento: Int

    while (true) {
        intento = (minimo + maximo) / 2
        println("¿Es $intento? (menor/igual/mayor)")
        var opcion = readln()
        if (opcion == "igual") break
        if (opcion == "menor") maximo = intento - 1
        if (opcion == "mayor") minimo = intento + 1
        if (maximo < minimo) {
            println("Estas haciendo trampas, tu número no existe")
            exitProcess(0)
        }
    }
    println("¡He adivinidao tu número, que es $intento!")

}