package com.meza.lozano.jorge.patterns.objectOriented.factoryMethod.notificaciones

class FabricaSMS extends FabricaNotificacion {
  def crearNotificacion(): Notificacion = new NotificacionSMS()
}
