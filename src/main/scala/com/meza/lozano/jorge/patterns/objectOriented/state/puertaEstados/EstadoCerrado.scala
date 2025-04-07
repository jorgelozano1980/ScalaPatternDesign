package com.meza.lozano.jorge.patterns.objectOriented.state.puertaEstados

class EstadoCerrado(puerta: Puerta) extends EstadoPuerta {
  def abrir(): Unit = {
    println("🚪 Puerta abierta.")
    puerta.cambiarEstado(new EstadoAbierto(puerta))
  }

  def cerrar(): Unit =
    println("⚠️ La puerta ya está cerrada.")
}
