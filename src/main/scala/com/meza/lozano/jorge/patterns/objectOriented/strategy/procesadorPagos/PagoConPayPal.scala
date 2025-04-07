package com.meza.lozano.jorge.patterns.objectOriented.strategy.procesadorPagos

class PagoConPayPal(email: String) extends EstrategiaPago {
  def pagar(monto: Double): Unit = {
    println(s"📧 Pagando $monto con PayPal (Cuenta: $email).")
  }
}
