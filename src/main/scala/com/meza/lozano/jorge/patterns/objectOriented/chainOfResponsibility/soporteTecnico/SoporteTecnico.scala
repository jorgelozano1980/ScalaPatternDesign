package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.soporteTecnico

class SoporteTecnico extends ManejadorBase {
  override def manejarSolicitud(solicitud: String): Unit = {
    if (solicitud == "problema técnico") {
      println("✅ Soporte Técnico resolvió el problema.")
    } else {
      println("➡️ Soporte Técnico no puede manejar esto, escalando...")
      super.manejarSolicitud(solicitud)
    }
  }
}
