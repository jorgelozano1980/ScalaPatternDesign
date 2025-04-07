package com.meza.lozano.jorge.patterns.objectOriented.state.maquinaExpendedora

trait EstadoMaquina {
  def insertarDinero(): Unit
  def seleccionarProducto(): Unit
  def entregarProducto(): Unit
}
