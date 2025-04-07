package com.meza.lozano.jorge.patterns.objectOriented.visitor.operacionesFiguras

class CalculadoraArea extends FiguraVisitor {
  def visitar(circulo: Circulo): Double = Math.PI * Math.pow(circulo.radio, 2)
  def visitar(rectangulo: Rectangulo): Double = rectangulo.ancho * rectangulo.alto
}
