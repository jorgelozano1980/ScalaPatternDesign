package com.meza.lozano.jorge.patterns.objectOriented.interpreter.variablesOperaciones

case class RestaVar(izquierda: Expresion, derecha: Expresion) extends Expresion {
  override def interpretar()(implicit contexto: Contexto): Int =
    izquierda.interpretar() - derecha.interpretar()
}
