package com.meza.lozano.jorge.patterns.objectOriented.visitor.calculoPrecioDescuento

class DescuentoEspecial extends DescuentoVisitor {
  def visitar(electronico: Electronico): Double = {
    val descuento = electronico.precio * 0.10
    electronico.precio - descuento
  }

  def visitar(ropa: Ropa): Double = {
    val descuento = ropa.precio * 0.20
    ropa.precio - descuento
  }
}
