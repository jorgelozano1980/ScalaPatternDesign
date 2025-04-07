package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.soporteTecnico

class Gerente extends ManejadorBase {
  override def manejarSolicitud(solicitud: String): Unit = {
    println(s"✅ Gerente resolvió la solicitud: $solicitud")
  }
}
