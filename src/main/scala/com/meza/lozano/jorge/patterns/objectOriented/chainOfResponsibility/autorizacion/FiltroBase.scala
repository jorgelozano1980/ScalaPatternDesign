package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.autorizacion

abstract class FiltroBase extends Filtro {
  private var siguienteFiltro: Option[Filtro] = None

  def establecerSiguiente(siguiente: Filtro): Filtro = {
    siguienteFiltro = Some(siguiente)
    siguiente
  }

  def verificar(credenciales: String): Boolean = {
    if (siguienteFiltro.isDefined) {
      siguienteFiltro.get.verificar(credenciales)
    } else {
      println("🚫 Acceso denegado.")
      false
    }
  }
}
