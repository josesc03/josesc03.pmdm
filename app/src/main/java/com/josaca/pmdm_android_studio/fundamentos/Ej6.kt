package com.josaca.pmdm_android_studio.fundamentos

fun main() {
    print("Dame una cantidad en Euros (€): ")
    var cantidadEuros:Double = readln().toDouble()
    println("$cantidadEuros equivale a ${cantidadEuros*1.16}$")
    println("$cantidadEuros equivale a ${cantidadEuros*0.84}£")
    println("$cantidadEuros equivale a ${cantidadEuros*132.5}¥")

}