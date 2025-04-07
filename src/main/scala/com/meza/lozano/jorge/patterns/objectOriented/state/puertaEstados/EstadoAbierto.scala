package com.meza.lozano.jorge.patterns.objectOriented.state.puertaEstados

class EstadoAbierto(puerta: Puerta) extends EstadoPuerta {
  def abrir(): Unit =
    println("⚠️ La puerta ya está abierta.")

  def cerrar(): Unit = {
    println("🔒 Puerta cerrada.")
    puerta.cambiarEstado(new EstadoCerrado(puerta))
  }
}
