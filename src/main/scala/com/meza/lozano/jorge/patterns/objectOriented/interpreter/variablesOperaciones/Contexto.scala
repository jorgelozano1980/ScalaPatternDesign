package com.meza.lozano.jorge.patterns.objectOriented.interpreter.variablesOperaciones

import scala.collection.mutable

class Contexto {
  private val valores = mutable.Map[String, Int]()

  def asignar(variable: String, valor: Int): Unit = {
    valores(variable) = valor
  }

  def obtener(variable: String): Int = {
    valores.getOrElse(variable, 0)
  }
}
