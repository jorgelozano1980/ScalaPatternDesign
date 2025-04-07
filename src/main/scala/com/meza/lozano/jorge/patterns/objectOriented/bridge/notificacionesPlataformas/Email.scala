package com.meza.lozano.jorge.patterns.objectOriented.bridge.notificacionesPlataformas

class Email extends PlataformaEnvio {
  def enviar(mensaje: String): Unit = println(s"📧 Enviando Email: $mensaje")
}
