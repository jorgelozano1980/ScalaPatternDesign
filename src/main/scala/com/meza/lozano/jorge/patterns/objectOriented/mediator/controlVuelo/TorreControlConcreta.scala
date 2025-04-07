package com.meza.lozano.jorge.patterns.objectOriented.mediator.controlVuelo

class TorreControlConcreta extends TorreControl {
  private var aviones: List[Avion] = List()

  def registrarAvion(avion: Avion): Unit = {
    aviones = aviones :+ avion
  }

  def notificar(avion: Avion, mensaje: String): Unit = {
    aviones.foreach(a => if (a != avion) a.recibirMensaje(mensaje))
  }
}
