package com.meza.lozano.jorge.patterns.objectOriented.bridge.notificacionesPlataformas

trait PlataformaEnvio {
  def enviar(mensaje: String): Unit
}
