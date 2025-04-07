package com.meza.lozano.jorge.patterns.objectOriented.visitor.calculoPrecioDescuento

trait Producto {
  def aceptar(visitor: DescuentoVisitor): Double
}
