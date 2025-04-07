package com.meza.lozano.jorge.patterns.objectOriented.decorator.notificaciones

class NotificacionBase extends Notificacion {
  def enviar(mensaje: String): Unit = println(s"📩 Notificación básica: $mensaje")
}
