package com.meza.lozano.jorge.patterns.objectOriented.mediator.controlVuelo

trait TorreControl {
  def notificar(avion: Avion, mensaje: String): Unit
}
