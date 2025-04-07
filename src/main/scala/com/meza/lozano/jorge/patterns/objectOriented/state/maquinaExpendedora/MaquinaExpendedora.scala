package com.meza.lozano.jorge.patterns.objectOriented.state.maquinaExpendedora

class MaquinaExpendedora {
  private var estado: EstadoMaquina = new EstadoSinDinero(this)

  def cambiarEstado(nuevoEstado: EstadoMaquina): Unit = {
    estado = nuevoEstado
  }

  def insertarDinero(): Unit = estado.insertarDinero()
  def seleccionarProducto(): Unit = estado.seleccionarProducto()
  def entregarProducto(): Unit = estado.entregarProducto()
}
