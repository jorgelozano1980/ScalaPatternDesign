package com.meza.lozano.jorge.patterns.objectOriented.prototype.figuras

// Círculo con clonación
case class Circulo(var x: Int, var y: Int, var radio: Int) extends Figura {
  override def clonar(): Figura = this.copy()
  override def dibujar(): Unit = println(s"🎨 Dibujando Círculo en ($x, $y) con radio $radio")
}
