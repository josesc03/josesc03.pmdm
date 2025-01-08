package com.josaca.pmdm_android_studio.control_de_flujo.returnbreakcontinue

fun main() {
    for (i in 1..20) {
        if (i % 4 == 0) continue
        println(i)
    }
}