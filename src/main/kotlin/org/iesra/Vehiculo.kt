package org.iesra

class Vehiculo(
    private val marca: String,
    private val modelo: String,
    private var kilometraje: Double = 0.0
) {

    fun registrarViaje(kilometros: Double) {
        if (kilometros <= 0) {
            throw IllegalArgumentException("Los kilometros deben ser positivos")
        }
        kilometraje += kilometros
        println("Viaje registrado: $kilometros km. kilometraje actual: $kilometraje km")

    }

    fun detalles(): String {
        return "Vehículo: $marca $modelo, Kilometraje: $kilometraje km"
    }

    override fun toString(): String {
        return detalles()
    }
}

fun main() {
    val miVehiculo = Vehiculo("Toyota", "Corolla")

    try {
        miVehiculo.registrarViaje(100.0)

        miVehiculo.registrarViaje(-50.0)
    } catch (e: IllegalArgumentException) {
        println("Error al registrar viaje: ${e.message}")
    }

    println(miVehiculo)
}