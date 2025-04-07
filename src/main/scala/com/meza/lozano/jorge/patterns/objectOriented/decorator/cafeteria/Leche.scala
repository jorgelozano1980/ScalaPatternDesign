package com.meza.lozano.jorge.patterns.objectOriented.decorator.cafeteria

class Leche(bebida: Bebida) extends Extra(bebida) {
  def descripcion: String = bebida.descripcion + " con Leche"
  def costo: Double = bebida.costo + 1.0
}
