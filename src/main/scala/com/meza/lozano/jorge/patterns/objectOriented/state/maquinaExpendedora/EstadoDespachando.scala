package com.meza.lozano.jorge.patterns.objectOriented.state.maquinaExpendedora

class EstadoDespachando(maquina: MaquinaExpendedora) extends EstadoMaquina {
  def insertarDinero(): Unit =
    println("⚠️ Espera, estamos procesando tu compra.")

  def seleccionarProducto(): Unit =
    println("⚠️ Ya seleccionaste un producto.")

  def entregarProducto(): Unit = {
    println("🎁 Producto entregado. Gracias por tu compra.")
    maquina.cambiarEstado(new EstadoSinDinero(maquina))
  }
}
