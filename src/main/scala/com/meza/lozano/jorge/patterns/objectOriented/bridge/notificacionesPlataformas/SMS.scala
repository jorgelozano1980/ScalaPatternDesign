package com.meza.lozano.jorge.patterns.objectOriented.bridge.notificacionesPlataformas

class SMS extends PlataformaEnvio {
  def enviar(mensaje: String): Unit = println(s"📩 Enviando SMS: $mensaje")
}
