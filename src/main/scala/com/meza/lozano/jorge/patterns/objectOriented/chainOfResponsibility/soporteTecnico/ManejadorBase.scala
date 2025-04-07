package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.soporteTecnico

abstract class ManejadorBase extends Manejador {
  private var siguienteManejador: Option[Manejador] = None

  def establecerSiguiente(siguiente: Manejador): Manejador = {
    siguienteManejador = Some(siguiente)
    siguiente
  }

  def manejarSolicitud(solicitud: String): Unit = {
    if (siguienteManejador.isDefined) {
      siguienteManejador.get.manejarSolicitud(solicitud)
    } else {
      println(s"No se pudo manejar la solicitud: $solicitud")
    }
  }
}
