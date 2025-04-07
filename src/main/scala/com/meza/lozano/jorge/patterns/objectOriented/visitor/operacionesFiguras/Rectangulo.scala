package com.meza.lozano.jorge.patterns.objectOriented.visitor.operacionesFiguras

class Rectangulo(val ancho: Double, val alto: Double) extends Figura {
  def aceptar(visitor: FiguraVisitor): Double = visitor.visitar(this)
}
