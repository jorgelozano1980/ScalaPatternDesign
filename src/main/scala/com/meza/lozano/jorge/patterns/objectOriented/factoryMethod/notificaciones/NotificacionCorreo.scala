package com.meza.lozano.jorge.patterns.objectOriented.factoryMethod.notificaciones

class NotificacionCorreo extends Notificacion {
  def enviar(mensaje: String): Unit = println(s"📧 Enviando correo: $mensaje")
}
