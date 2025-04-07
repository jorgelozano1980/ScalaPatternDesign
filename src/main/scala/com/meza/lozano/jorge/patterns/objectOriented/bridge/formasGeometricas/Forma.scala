package com.meza.lozano.jorge.patterns.objectOriented.bridge.formasGeometricas

abstract class Forma(protected val color: Color) {
  def dibujar(): Unit
}
