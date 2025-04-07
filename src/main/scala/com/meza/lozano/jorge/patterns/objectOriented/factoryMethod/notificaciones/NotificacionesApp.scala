package com.meza.lozano.jorge.patterns.objectOriented.factoryMethod.notificaciones

object NotificacionesApp extends App {
  val fabricaCorreo: FabricaNotificacion = new FabricaCorreo()
  val correo: Notificacion = fabricaCorreo.crearNotificacion()
  correo.enviar("Hola, este es un correo.")

  val fabricaSMS: FabricaNotificacion = new FabricaSMS()
  val sms: Notificacion = fabricaSMS.crearNotificacion()
  sms.enviar("Hola, este es un SMS.")
}
