package com.meza.lozano.jorge.patterns.objectOriented.prototype.figuras

trait Figura extends Cloneable {
  var x: Int
  var y: Int

  def clonar(): Figura
  def dibujar(): Unit
}
