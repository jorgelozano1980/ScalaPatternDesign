package com.meza.lozano.jorge.patterns.objectOriented.decorator.cafeteria

abstract class Extra(bebida: Bebida) extends Bebida {
  def descripcion: String
  def costo: Double
}
