package com.josaca.pmdm_android_studio.control_de_flujo.while0

import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    print("Indica con cuantas monedas quieres comenzar: ")
    var monedasiniciales: Int
    var monedas: Int
    try {
        monedasiniciales = readln().toInt()
        monedas = monedasiniciales
        if (monedasiniciales < 1) {
            println("Debes introducir un numero entero positivo")
            exitProcess(0)
        }
    } catch (e: Exception) {
        println("Debes introducir un numero entero positivo")
        exitProcess(0)
    }

    do {
        var tirada1: Int = Random.nextInt(1, 6)
        var tirada2: Int = Random.nextInt(1, 6)
        var tirada3: Int = Random.nextInt(1, 6)

        monedas--
        println("Tirada: $tirada1 - $tirada2 - $tirada3")

        if (tirada1 == tirada2 && tirada1 == tirada3) {
            println("PREMIO GORDO ¡Ganas 5 monedas!")
            monedas += 5
            println("Monedas actuales: $monedas")

        } else if (tirada1 == tirada2 || tirada1 == tirada3 || tirada2 == tirada3) {
            println("PREMIO ¡Ganas 2 monedas!")
            monedas += 2
            println("Monedas actuales: $monedas")
        } else {
            println("Has perdido... no recuperas ninguna moneda")
            println("Monedas actuales: $monedas")
        }

        println("¿Desea seguir apostando? (s/n)")
        var respuesta = readln().lowercase()
        if (respuesta != "s" || monedas < 1) break

    } while (true)

    println(
        "- - - - - - - - - - - -\n" +
                "Has ${if (monedasiniciales < monedas) "ganado ${monedas - monedasiniciales}" else "perdido ${monedasiniciales - monedas}"} moneda/s\n" +
                "- - - - - - - - - - - -"
    )

}