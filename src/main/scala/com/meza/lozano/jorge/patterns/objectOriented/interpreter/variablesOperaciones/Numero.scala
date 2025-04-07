package com.meza.lozano.jorge.patterns.objectOriented.interpreter.variablesOperaciones

// Expresión para valores numéricos
case class Numero(valor: Int) extends Expresion {
  override def interpretar()(implicit contexto: Contexto): Int = valor
}
