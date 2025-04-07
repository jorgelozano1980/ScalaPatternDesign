package com.meza.lozano.jorge.patterns.modular.flyweight.dibujarArboles

case class Arbol(x: Int, y: Int, tipo: ArbolTipo) {
  def dibujar(): Unit = {
    println(s"🌳 Dibujando '${tipo.nombre}' en ($x, $y) con color ${tipo.color}")
  }
}
