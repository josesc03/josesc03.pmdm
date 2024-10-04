package com.josaca.pmdm_android_studio.fundamentos

fun main() {
    print("Introduzca su nombre: ")
    var nombre:String = readln()
    print("Introduzca su edad: ")
    var edad:Int = readln().toInt()
    print("Introduzca su salario: ")
    var salario:Double = readln().toDouble()
    var restanteJubilacion:Int = 65-edad
    if (restanteJubilacion > 0) {
        println("Le quedan $restanteJubilacion años para jubilarse")
    } else {
        print("Usted ya está jubilado")
    }
    var salarioCalculado:Double = salario - (salario * 0.1)
    print("Y su salario anual es de $salarioCalculado")
}