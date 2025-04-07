package com.meza.lozano.jorge.patterns.objectOriented.bridge.formasGeometricas

class Cuadrado(color: Color) extends Forma(color) {
  def dibujar(): Unit = println(s"⬜ Cuadrado de color ${color.pintar()}")
}
