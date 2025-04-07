package com.meza.lozano.jorge.patterns.objectOriented.decorator.notificaciones

abstract class NotificacionDecorator(notificacion: Notificacion) extends Notificacion {
  def enviar(mensaje: String): Unit = notificacion.enviar(mensaje)
}
