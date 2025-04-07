package com.meza.lozano.jorge.patterns.objectOriented.visitor.calculoPrecioDescuento

class Ropa(val precio: Double) extends Producto {
  def aceptar(visitor: DescuentoVisitor): Double = visitor.visitar(this)
}
