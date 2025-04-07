package com.meza.lozano.jorge.patterns.objectOriented.interpreter.expresionesMatematicas

// Expresión para números enteros
case class Numero(valor: Int) extends Expresion {
  override def interpretar(): Int = valor
}
