package com.meza.lozano.jorge.patterns.objectOriented.bridge.notificacionesPlataformas

abstract class Notificacion(protected val plataforma: PlataformaEnvio) {
  def enviarMensaje(mensaje: String): Unit
}