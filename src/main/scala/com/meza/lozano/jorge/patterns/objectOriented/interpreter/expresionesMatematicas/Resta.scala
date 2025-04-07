package com.meza.lozano.jorge.patterns.objectOriented.interpreter.expresionesMatematicas

// Expresión para resta
case class Resta(izquierda: Expresion, derecha: Expresion) extends Expresion {
  override def interpretar(): Int = izquierda.interpretar() - derecha.interpretar()
}
