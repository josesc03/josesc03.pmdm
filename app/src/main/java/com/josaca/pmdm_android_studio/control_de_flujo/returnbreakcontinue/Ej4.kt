package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

fun main() {
    for (i in 1..30) {
        if (i % 2 == 0) continue
        if (i > 25) break
        println(i)
    }
}