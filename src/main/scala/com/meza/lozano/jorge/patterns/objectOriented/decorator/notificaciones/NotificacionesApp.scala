package com.meza.lozano.jorge.patterns.objectOriented.decorator.notificaciones

object NotificacionesApp extends App {
  val notificacionBasica = new NotificacionBase
  val notificacionConEmail = new NotificacionEmail(notificacionBasica)
  val notificacionConSMSyEmail = new NotificacionSMS(notificacionConEmail)

  println("🔹 Enviando solo notificación básica:")
  notificacionBasica.enviar("Hola!")

  println("\n🔹 Enviando notificación con Email:")
  notificacionConEmail.enviar("Hola!")

  println("\n🔹 Enviando notificación con Email y SMS:")
  notificacionConSMSyEmail.enviar("Hola!")
}
