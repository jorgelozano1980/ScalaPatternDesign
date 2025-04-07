package com.meza.lozano.jorge.patterns.objectOriented.interpreter.expresionesMatematicas

// Expresión para suma
case class Suma(izquierda: Expresion, derecha: Expresion) extends Expresion {
  override def interpretar(): Int = izquierda.interpretar() + derecha.interpretar()
}
