package com.meza.lozano.jorge.patterns.objectOriented.visitor.calculoPrecioDescuento

trait DescuentoVisitor {
  def visitar(electronico: Electronico): Double
  def visitar(ropa: Ropa): Double
}
