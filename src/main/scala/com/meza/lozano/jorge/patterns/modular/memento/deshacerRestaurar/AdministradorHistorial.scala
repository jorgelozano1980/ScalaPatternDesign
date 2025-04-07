package com.meza.lozano.jorge.patterns.modular.memento.deshacerRestaurar

import scala.collection.mutable

class AdministradorHistorial {
  private val historial = mutable.Stack[Memento]()

  def guardarMemento(memento: Memento): Unit = {
    historial.push(memento)
  }

  def deshacer(): Option[Memento] = {
    if (historial.nonEmpty) Some(historial.pop()) else None
  }
}
