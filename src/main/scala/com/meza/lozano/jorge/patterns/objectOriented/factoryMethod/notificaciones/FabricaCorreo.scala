package com.meza.lozano.jorge.patterns.objectOriented.factoryMethod.notificaciones

class FabricaCorreo extends FabricaNotificacion {
  def crearNotificacion(): Notificacion = new NotificacionCorreo()
}
