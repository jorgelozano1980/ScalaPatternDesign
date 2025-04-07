package com.meza.lozano.jorge.patterns.objectOriented.strategy.procesadorPagos

class PagoConTarjeta(numeroTarjeta: String) extends EstrategiaPago {
  def pagar(monto: Double): Unit = {
    println(s"💳 Pagando $monto con tarjeta de crédito (N° $numeroTarjeta).")
  }
}
