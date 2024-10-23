package com.josaca.pmdm_android_studio.control_de_flujo.when0

import kotlin.system.exitProcess

fun main() {
    println("Ingrese su rol: (Admin, Editor, Viewer) ")
    var rol: String = readln().uppercase()
    if (rol.equals("ADMIN")
        || rol.equals("EDITOR")
        || rol.equals("VIEWER")
    ) {

        println("Ingrese la accion que quieres realizar: (ver, crear, editar, eliminar) ")
        var accion: String = readln().uppercase()
        if (accion.equals("VER")
            || accion.equals("CREAR")
            || accion.equals("EDITAR")
            || accion.equals("ELIMINAR")
        ) {

            if (capazDeAccion(rol, accion)) {
                print("SI eres capaz de $accion siendo $rol")
            } else {
                print("NO eres capaz de $accion siendo $rol")
            }

        } else {
            println("Tienes que introducir una de las acciones.")
            exitProcess(0)
        }

    } else {
        println("Tienes que introducir uno de los roles.")
        exitProcess(0)
    }
}

fun capazDeAccion(rol: String, accion: String): Boolean {
    return when {
        rol.equals("ADMIN") -> true
        rol.equals("EDITOR") && (accion.equals("VER") || accion.equals("EDITAR")) -> true
        rol.equals("VIEWER") && accion.equals("VER") -> true
        else -> false
    }
}