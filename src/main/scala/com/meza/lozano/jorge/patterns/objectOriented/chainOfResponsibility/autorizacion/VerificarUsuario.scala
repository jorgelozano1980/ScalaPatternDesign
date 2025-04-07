package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.autorizacion

class VerificarUsuario extends FiltroBase {
  override def verificar(credenciales: String): Boolean = {
    if (credenciales == "usuario_valido") {
      println("✅ Usuario verificado.")
      super.verificar(credenciales)
    } else {
      println("🚫 Usuario inválido.")
      false
    }
  }
}
