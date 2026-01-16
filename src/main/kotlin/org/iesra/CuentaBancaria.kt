package org.iesra

class CuentaBancaria(val titular: String) {

    var saldo: Double = 0.0
        private set

    fun ingresar(cantidad: Double) {
        if (cantidad <= 0) {
            throw IllegalArgumentException("No se puede ingresar una cantidad menor o igual a 0")
        }

        saldo += cantidad
        println("Ingreso realizado con éxito. Saldo actual: $saldo")
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= 0){
            throw IllegalArgumentException("No se puede retirar una cantidad menor o igual a 0")
        }

        if (cantidad > saldo) {
            throw IllegalStateException("Saldo insuficiente. Saldo actual: $saldo")
        }

        saldo -= cantidad
        println("Retiro realizado con éxito. Saldo actual: $saldo")
    }

}


fun main(){
    val cuenta =  CuentaBancaria("Indalecio Domínguez")
    println("Cuenta creada a nombre de: ${cuenta.titular}")

    try {
        cuenta.ingresar(100.0)
        cuenta.retirar(50.0)
        cuenta.retirar(80.0)
    } catch (e: Exception){
        println("Error: ${e.message}")
    }
}