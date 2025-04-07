package com.meza.lozano.jorge.patterns.objectOriented.visitor.operacionesFiguras

trait FiguraVisitor {
  def visitar(circulo: Circulo): Double
  def visitar(rectangulo: Rectangulo): Double
}
