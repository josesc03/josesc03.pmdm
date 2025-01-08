package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

fun main() {

    for (i in 1..100) {
        if (i % 13 == 0) break
        println(i)
    }
}