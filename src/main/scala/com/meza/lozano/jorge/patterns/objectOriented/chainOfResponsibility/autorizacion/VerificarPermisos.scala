package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.autorizacion

class VerificarPermisos extends FiltroBase {
  override def verificar(credenciales: String): Boolean = {
    if (credenciales == "usuario_valido") {
      println("✅ Permisos concedidos.")
      super.verificar(credenciales)
    } else {
      println("🚫 Permiso denegado.")
      false
    }
  }
}
