package com.meza.lozano.jorge.patterns.objectOriented.mediator.controlVuelo

object TorreControlApp extends App {
  val torre = new TorreControlConcreta()

  val avion1 = new Avion("Boeing 737", torre)
  val avion2 = new Avion("Airbus A320", torre)

  torre.registrarAvion(avion1)
  torre.registrarAvion(avion2)

  avion1.enviarMensaje("Solicitando permiso para aterrizar.")
}
