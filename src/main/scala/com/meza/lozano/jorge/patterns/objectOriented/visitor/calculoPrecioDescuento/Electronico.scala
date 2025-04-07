package com.meza.lozano.jorge.patterns.objectOriented.visitor.calculoPrecioDescuento

class Electronico(val precio: Double) extends Producto {
  def aceptar(visitor: DescuentoVisitor): Double = visitor.visitar(this)
}
