package com.josaca.pmdm_android_studio.control_de_flujo.ifelse

fun main() {
    var eleccion: String
    var tipo: String
    var ingrediente: String
    println("---- Pizzeria Bella Napoli ----")
    while (true) {
        print("¿Quiere pizza vegetariana? (s/n): ")
        eleccion = readln().uppercase()
        if (eleccion == "S" || eleccion == "N") break
        else println("Tienes que seleccionar s o n")
    }

    if (eleccion == "S") {
        tipo = "vegetariana"
        println("---- MENU ----")
        println("1. Pimiento")
        println("2. Tofu")
        print("Elija un ingrediente (1,2): ")
        var eleccioningrediente = readln()

        while (true) {
            if (eleccioningrediente.equals("1")) {
                ingrediente = "pimiento"
                break
            } else if (eleccioningrediente.equals("2")) {
                ingrediente = "tofu"
                break
            } else {
                println("Elije uno de los ingredientes")
            }
        }
    } else {
        tipo = "no vegetariana"

        println("---- MENU ----")
        println("1. Peperoni")
        println("2. Jamon")
        println("3. Salmon")

        print("Elija un ingrediente (1,2,3): ")
        var eleccioningrediente = readln()

        while (true) {
            if (eleccioningrediente.equals("1")) {
                ingrediente = "peperoni"
                break
            } else if (eleccioningrediente.equals("2")) {
                ingrediente = "jamon"
                break
            } else if (eleccioningrediente.equals("3")) {
                ingrediente = "salmon"
                break
            } else {
                println("Elije uno de los ingredientes")

            }
        }
    }

    println("Su pizza es $tipo y lleva; mozzarella, tomate, y $ingrediente")

    println("-------------------------------")
}