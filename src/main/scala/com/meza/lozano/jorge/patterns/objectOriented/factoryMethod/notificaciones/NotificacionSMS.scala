package com.meza.lozano.jorge.patterns.objectOriented.factoryMethod.notificaciones

class NotificacionSMS extends Notificacion {
  def enviar(mensaje: String): Unit = println(s"📱 Enviando SMS: $mensaje")
}
