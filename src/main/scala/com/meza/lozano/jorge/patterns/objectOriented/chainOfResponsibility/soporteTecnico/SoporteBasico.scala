package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.soporteTecnico

class SoporteBasico extends ManejadorBase {
  override def manejarSolicitud(solicitud: String): Unit = {
    if (solicitud == "consulta básica") {
      println("✅ Soporte Básico resolvió el problema.")
    } else {
      println("➡️ Soporte Básico no puede manejar esto, escalando...")
      super.manejarSolicitud(solicitud)
    }
  }
}
