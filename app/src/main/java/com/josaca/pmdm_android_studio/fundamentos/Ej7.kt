package com.josaca.pmdm_android_studio.fundamentos

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    print("Ingrese el radio del circulo: ")
    var radio:Double = readln().toDouble()
    println("El perimetro de el circulo es de ${PI * (radio*2)}")
    println("El area del circulo es de ${PI * radio.pow(2.0)}")
    println("El volumen de la esfera es de ${(4/3.0) * PI * radio.pow(3.0)}")
    print("La superficie de la esfera es de ${4* PI*Math.pow(radio,2.0)}")
}