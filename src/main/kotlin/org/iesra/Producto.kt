package org.iesra

class Producto(
    val nombre: String,
    private var precio: Double,
    private var stock: Int
) {
    init {
        require(precio > 0) {"El precio debe de ser positivo" }
        require(stock >= 0) {"El stock no puede ser negativo" }
    }

    fun vender(cantidad: Int) {
        if (cantidad <= 0) {
            println("Cantidad a vender debe ser mayor que 0")
            return
        }

        if (cantidad > stock) {
            println("Stock insuficiente. Stock actual: $stock")
            return
        }

        stock -= cantidad
        println("Se han vendido $cantidad unidades de $nombre. Stock restante: $stock")
    }

    fun reabastecer(cantidad: Int) {
        if (cantidad <= 0) {
            println("Cantidad a reabastecer debe ser mayor que 0")
            return
        }
        stock += cantidad
        println("Se han reabastecido $cantidad unidades de $nombre. Stock actual: $stock")
    }

    override fun toString(): String {
        return "Producto: $nombre, Precio: $precio€, Stock: $stock"
    }
}

fun main() {

    val producto1 = Producto("Camiseta", 20.0, 10)
    val producto2 = Producto("Pantalón", 35.5, 5)
    val producto3 = Producto("Zapatos", 50.0, 0)


    println("=== Productos iniciales ===")
    println(producto1)
    println(producto2)
    println(producto3)

    println("\n--- Operaciones ---")

    producto1.vender(3)
    producto2.vender(10)
    producto3.reabastecer(15)
    producto3.vender(5)

    println("\n=== Productos actualizados ===")

    println(producto1)
    println(producto2)
    println(producto3)
}
