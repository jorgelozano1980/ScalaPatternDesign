package com.meza.lozano.jorge.patterns.objectOriented.visitor.operacionesFiguras

trait Figura {
  def aceptar(visitor: FiguraVisitor): Double
}
