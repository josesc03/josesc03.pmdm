package com.josaca.pmdm_android_studio.control_de_flujo.for0

fun main() {
    var lista: List<Int> = listOf(1, 20, 3, 34, 90, 6, 89, 8, 9)
    var lista_desordenada: List<Int> = lista.shuffled()

    var mayor = Int.MIN_VALUE

    for (elemento in lista_desordenada) {
        if (elemento > mayor) mayor = elemento
    }

    print(mayor)
}