package com.meza.lozano.jorge.patterns.objectOriented.bridge.notificacionesPlataformas

class Recordatorio(plataforma: PlataformaEnvio) extends Notificacion(plataforma) {
  def enviarMensaje(mensaje: String): Unit =
    plataforma.enviar(s"🔔 RECORDATORIO: $mensaje")
}
