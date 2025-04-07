package com.meza.lozano.jorge.patterns.modular.memento.progresojuego

import scala.collection.mutable

class AdministradorGuardado {
  private val guardados = mutable.Stack[Memento]()

  def guardarPartida(memento: Memento): Unit = {
    guardados.push(memento)
    println("💾 Partida guardada!")
  }

  def cargarPartida(): Option[Memento] = {
    if (guardados.nonEmpty) {
      println("🔄 Cargando partida...")
      Some(guardados.pop())
    } else {
      println("⚠️ No hay partidas guardadas.")
      None
    }
  }
}
