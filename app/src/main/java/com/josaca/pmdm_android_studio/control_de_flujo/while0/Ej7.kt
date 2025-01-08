package com.josaca.pmdm_android_studio.control_de_flujo.while0

fun main() {
    var maximo: Int
    var anterior = 0
    var ultimo = 1
    try {
        print("Ingrese el numero maximo: ")
        maximo = readln().toInt()
        if (maximo < 0) {
            println("Tienes que ingresar un numero entero")
        } else {
            print("$anterior, $ultimo")
            while (true) {
                var temporal: Int = anterior
                anterior = ultimo
                ultimo += temporal
                if (ultimo > maximo) {
                    break
                }
                print(", $ultimo")
            }
        }
    } catch (e: Exception) {
        println("Tienes que ingresar un numero entero no negativo")
    }
}