package com.meza.lozano.jorge.patterns.objectOriented.interpreter.variablesOperaciones

case class Variable(nombre: String) extends Expresion {
  override def interpretar()(implicit contexto: Contexto): Int = {
    contexto.obtener(nombre)
  }
}
