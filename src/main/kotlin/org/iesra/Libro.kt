package org.iesra

class Libro(
    val titulo: String,
    val autor: String,
    val numPaginas: Int,
    val leido: Boolean
) {
    init {
        require(titulo.isNotBlank()) {"El título no puede estar vacío."}
        require(autor.isNotBlank()) {"El autor no puede estar vacío"}
        require(numPaginas in 1..5000) {"El número de páginas debe de ser mayor a 0 y menor a 5000"}
    }

    constructor(titulo: String, autor: String ) : this(titulo, autor, 100, false)

    override fun toString(): String {
        val leidoTexto = if (leido) "Sí" else "No"
        return "Libro: $titulo, por $autor, Páginas $numPaginas, Leído $leidoTexto"
    }
}

fun main() {
    try {

        val libro1 = Libro("Harry Potter y el cáliz de fuego", "J.K.Rowling", 640, true)
        val libro2 = Libro("El viejo y el mar", "Hemingway")

        println(libro1)
        println(libro2)

        val libro3 = Libro("", "Chamaco")

    } catch (e: IllegalArgumentException) {
        println("Error al crear libro: ${e.message}")

    }
}