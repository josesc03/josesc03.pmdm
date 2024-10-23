package com.josaca.pmdm_android_studio.control_de_flujo.for0

fun main() {
    var lista: List<String> = listOf("elemento1", "elemento2", "elemento3")

    for (elemento in lista) {
        println(elemento)
    }

    println("\n---\n")

    for (i in lista.size - 1 downTo 0) {
        println(lista[i])
    }
}