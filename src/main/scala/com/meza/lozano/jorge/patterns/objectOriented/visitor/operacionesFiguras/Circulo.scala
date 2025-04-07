package com.meza.lozano.jorge.patterns.objectOriented.visitor.operacionesFiguras

class Circulo(val radio: Double) extends Figura {
  def aceptar(visitor: FiguraVisitor): Double = visitor.visitar(this)
}
