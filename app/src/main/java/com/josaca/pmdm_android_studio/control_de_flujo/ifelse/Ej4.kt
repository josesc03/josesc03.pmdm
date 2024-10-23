package com.josaca.pmdm_android_studio.control_de_flujo.ifelse

fun main() {
    while (true) {
        println("\n---- Los tres numeros ----")
        print("Escribe el primer entero: (Escribe \"exit\" para salir) ")
        var opcion = readln()
        if (opcion.equals("exit")) {
            break
        }

        try {
            var numero1 = opcion.toInt()

            print("Escribe el segundo entero: ")
            var numero2 = readln().toInt()

            print("Escribe el segundo entero: ")
            var numero3 = readln().toInt()

            if (numero1 == numero2 && numero1 == numero3) {
                print("Todos los numeros son iguales")
            } else if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
                print("Dos numeros son iguales")
            } else {
                print("Todos los numeros son diferentes")
            }

        } catch (e: NumberFormatException) {
            print("Tiene que ingresar un numero entero")
        }
        println("--------------------------")
    }
    println("--------------------------")
}