import kotlin.system.exitProcess

fun main() {
    println("Ingrese el nombre de la figura: (Circulo, Rectangulo, Triangulo)")
    var figura: String = readln().uppercase()

    if (figura in arrayOf("CIRCULO", "RECTANGULO", "TRIANGULO")) {
        print("Ingrese el primer parámetro de la figura (radio, largo, base): ")
        val param1: Double = readln().toDouble()

        val param2: Double = if (figura != "CIRCULO") {
            print("Ingrese el segundo parámetro de la figura (ancho o altura): ")
            readln().toDouble()
        } else {
            0.0
        }

        println("El área del $figura es: ${calcularArea(figura, param1, param2)}")

    } else {
        println("Tienes que introducir el nombre de una de las figuras disponibles.")
        exitProcess(0)
    }
}

fun calcularArea(figura: String, param1: Double, param2: Double): Double {
    return when (figura) {
        "CIRCULO" -> Math.PI * param1 * param1
        "RECTANGULO" -> param1 * param2
        "TRIANGULO" -> (param1 * param2) / 2
        else -> throw IllegalArgumentException("###ERROR###")
    }
}
