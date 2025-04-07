package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.autorizacion

class VerificarAutenticacion extends FiltroBase {
  override def verificar(credenciales: String): Boolean = {
    println("✅ Autenticación exitosa.")
    true
  }
}
