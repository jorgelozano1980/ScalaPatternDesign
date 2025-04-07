package com.meza.lozano.jorge.patterns.objectOriented.bridge.notificacionesPlataformas

class Alerta(plataforma: PlataformaEnvio) extends Notificacion(plataforma) {
  def enviarMensaje(mensaje: String): Unit =
    plataforma.enviar(s"⚠️ ALERTA: $mensaje")
}
