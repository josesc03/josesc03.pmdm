package com.josaca.pmdm_android_studio.control_de_flujo.when0

fun main() {
    val vehiculos: List<Any> = listOf(
        Coche("Toyota", "Corolla", 4),
        Motocicleta("Yamaha", 600),
        Camion("Mercedes", 5000)
    )

    for (vehiculo in vehiculos) {
        when (vehiculo) {
            is Coche -> println("Es un coche ${vehiculo.marca} de ${vehiculo.numeroDePuertas} con modelo ${vehiculo.modelo}.")
            is Motocicleta -> println("Es una motocicleta ${vehiculo.marca} con cilindrada de ${vehiculo.cilindrada} cc.")
            is Camion -> println("Es un camión ${vehiculo.marca} con capacidad de carga de ${vehiculo.capacidadDeCarga} kg.")
            else -> println("Tipo de vehículo desconocido.")
        }
    }
}

class Coche(val marca: String, val modelo: String, val numeroDePuertas: Int) {
}

class Motocicleta(val marca: String, val cilindrada: Int) {
}

class Camion(val marca: String, val capacidadDeCarga: Int) {
}
