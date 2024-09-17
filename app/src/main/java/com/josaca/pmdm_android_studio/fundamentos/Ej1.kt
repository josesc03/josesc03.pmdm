package com.josaca.pmdm_android_studio.fundamentos

fun main() {
    print("Esto es un programa para elaborar un saludo.\nEscriba su nombre: ")
    var nombre:String = readln().toString()
    saludo(nombre)
}

fun saludo(nombre:String) {
    print("Hola $nombre")
}