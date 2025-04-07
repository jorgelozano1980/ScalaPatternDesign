package com.meza.lozano.jorge.patterns.objectOriented.decorator.notificaciones

class NotificacionEmail(notificacion: Notificacion) extends NotificacionDecorator(notificacion) {
  override def enviar(mensaje: String): Unit = {
    super.enviar(mensaje)
    println(s"📧 Enviando Email: $mensaje")
  }
}
