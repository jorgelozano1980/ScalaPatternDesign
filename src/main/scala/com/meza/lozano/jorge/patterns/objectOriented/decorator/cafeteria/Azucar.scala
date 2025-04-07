package com.meza.lozano.jorge.patterns.objectOriented.decorator.cafeteria

class Azucar(bebida: Bebida) extends Extra(bebida) {
  def descripcion: String = bebida.descripcion + " con Azúcar"
  def costo: Double = bebida.costo + 0.5
}
