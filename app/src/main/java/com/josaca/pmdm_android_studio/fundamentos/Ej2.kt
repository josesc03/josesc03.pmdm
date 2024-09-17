package com.josaca.pmdm_android_studio.fundamentos

fun main() {
    print("Programa para realizar cálculos.\nEscribe un numero: ")
    var primero:Double = readln().toDouble()
    print("Escribe otro numero: ")
    var segundo:Double = readln().toDouble()
    println("Vamos a hacer operaciones con los números $primero y $segundo")
    calculadora(primero, segundo)
}

fun calculadora(primero:Double, segundo:Double) {
    println("$primero + $segundo = ${primero+segundo}")
    println("$primero - $segundo = ${primero-segundo}")
    println("$primero * $segundo = ${primero*segundo}")
    println("$primero / $segundo = ${primero/segundo}")
    println("$segundo / $primero = ${segundo/primero}")
    println("$primero % $segundo = ${primero%segundo}")
}