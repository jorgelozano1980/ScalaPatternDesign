package com.meza.lozano.jorge.patterns.objectOriented.state.maquinaExpendedora

class EstadoSinDinero(maquina: MaquinaExpendedora) extends EstadoMaquina {
  def insertarDinero(): Unit = {
    println("💰 Dinero insertado.")
    maquina.cambiarEstado(new EstadoConDinero(maquina))
  }

  def seleccionarProducto(): Unit =
    println("⚠️ Inserta dinero antes de seleccionar un producto.")

  def entregarProducto(): Unit =
    println("⚠️ Primero debes pagar para recibir un producto.")
}
