package org.iesra

class Estudiante(private val nombre: String, ) {

    private var nota: Double = 0.0

    fun setNota(valor: Double) {
        nota = when {
            valor <0 -> 0.0
            valor > 10 -> 10.0
            else -> valor
        }
    }

    fun getNota(): Double = nota

    override fun toString(): String {
        return "Estudiante: $nombre, Nota: $nota"
    }
}


fun main() {
    val estudiante1 = Estudiante("Indalecio")
    val estudiante2 = Estudiante("Guillermo")
    val estudiante3 = Estudiante("Alejandro")

    estudiante1.setNota(8.5)
    estudiante2.setNota(-2.0)
    estudiante3.setNota(12.0)

    println(estudiante1)
    println(estudiante2)
    println(estudiante3)

    println("La nota de Indalecio es: ${estudiante1.getNota()} ")
    println("La nota de Guillermo es: ${estudiante2.getNota()} ")
    println("La nota de Alejandro es: ${estudiante3.getNota()} ")
}
