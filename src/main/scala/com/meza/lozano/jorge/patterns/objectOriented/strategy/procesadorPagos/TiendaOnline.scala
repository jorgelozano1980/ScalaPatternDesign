package com.meza.lozano.jorge.patterns.objectOriented.strategy.procesadorPagos

class TiendaOnline {
  private var estrategiaPago: EstrategiaPago = _

  def setEstrategia(estrategia: EstrategiaPago): Unit = {
    estrategiaPago = estrategia
  }

  def procesarPago(monto: Double): Unit = {
    if (estrategiaPago == null) {
      println("⚠️ No se ha seleccionado un método de pago.")
    } else {
      estrategiaPago.pagar(monto)
    }
  }
}
