package com.meza.lozano.jorge.patterns.objectOriented.state.maquinaExpendedora

class EstadoConDinero(maquina: MaquinaExpendedora) extends EstadoMaquina {
  def insertarDinero(): Unit =
    println("⚠️ Ya insertaste dinero.")

  def seleccionarProducto(): Unit = {
    println("✅ Producto seleccionado.")
    maquina.cambiarEstado(new EstadoDespachando(maquina))
  }

  def entregarProducto(): Unit =
    println("⚠️ Primero debes seleccionar un producto.")
}
