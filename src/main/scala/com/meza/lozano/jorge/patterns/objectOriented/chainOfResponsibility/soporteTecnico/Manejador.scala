package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.soporteTecnico

trait Manejador {
  def establecerSiguiente(siguiente: Manejador): Manejador
  def manejarSolicitud(solicitud: String): Unit
}
