package com.meza.lozano.jorge.patterns.objectOriented.state.puertaEstados

class Puerta {
  private var estado: EstadoPuerta = new EstadoCerrado(this)

  def cambiarEstado(nuevoEstado: EstadoPuerta): Unit = {
    estado = nuevoEstado
  }

  def abrir(): Unit = estado.abrir()
  def cerrar(): Unit = estado.cerrar()
}
