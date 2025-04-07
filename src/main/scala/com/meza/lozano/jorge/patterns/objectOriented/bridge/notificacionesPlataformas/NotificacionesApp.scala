package com.meza.lozano.jorge.patterns.objectOriented.bridge.notificacionesPlataformas

object NotificacionesApp extends App {
  val alertaEmail = new Alerta(new Email)
  val recordatorioSMS = new Recordatorio(new SMS)

  alertaEmail.enviarMensaje("Servidor caído!")   // 📧 Enviando Email: ⚠️ ALERTA: Servidor caído!
  recordatorioSMS.enviarMensaje("Reunión a las 10AM") // 📩 Enviando SMS: 🔔 RECORDATORIO: Reunión a las 10AM
}
