package com.meza.lozano.jorge.patterns.objectOriented.bridge.formasGeometricas

class Circulo(color: Color) extends Forma(color) {
  def dibujar(): Unit = println(s"⚪ Círculo de color ${color.pintar()}")
}
