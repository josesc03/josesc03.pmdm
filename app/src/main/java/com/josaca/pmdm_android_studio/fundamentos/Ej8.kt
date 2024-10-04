package com.josaca.pmdm_android_studio.fundamentos

fun main() {
    print("Ingrese el primer numero: ")
    var a: Double = readln().toDouble()
    print("Ingrese el segundo numero: ")
    var b: Double = readln().toDouble()
    print("Ingrese el tercero numero: ")
    var c: Double = readln().toDouble()
    print("Ingrese el cuarto numero: ")

    var d: Double = readln().toDouble()
    var operacion_1 = a + b - c + d
    var operacion_2 = (a * b + c * d) / (a + b + c + d)
    var operacion_3 = a * a + b * b - c / d
    var operacion_4 = a > b
    var operacion_5 = a - b <= c - d
    var operacion_6 = a > b || c < d
    var operacion_7 = a < b && c < d || a + b > c - d
    var operacion_8 = a + d < b * (c - a)

    println("a+b-c+d = $operacion_1")
    println("(a*b+c*d)/(a+b+c+d) = $operacion_2")
    println("a*a+b*b-c/d = $operacion_3")
    println("a>b = $operacion_4")
    println("a-b <= c-d = $operacion_5")

    println("a>b || c<d = $operacion_6")
    println("a<b && c<d || a+b>c-d = $operacion_7")
    println("a+d <b*(c-a) = $operacion_8")

}