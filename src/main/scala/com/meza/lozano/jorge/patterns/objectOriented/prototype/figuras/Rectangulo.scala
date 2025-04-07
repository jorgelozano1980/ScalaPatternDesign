package com.meza.lozano.jorge.patterns.objectOriented.prototype.figuras

// Rectángulo con clonación
case class Rectangulo(var x: Int, var y: Int, var ancho: Int, var alto: Int) extends Figura {
  override def clonar(): Figura = this.copy()
  override def dibujar(): Unit = println(s"📏 Dibujando Rectángulo en ($x, $y) con tamaño $ancho x $alto")
}
