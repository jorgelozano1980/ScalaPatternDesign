package com.meza.lozano.jorge.patterns.objectOriented.interpreter.variablesOperaciones

trait Expresion {
  def interpretar()(implicit contexto: Contexto): Int
}
