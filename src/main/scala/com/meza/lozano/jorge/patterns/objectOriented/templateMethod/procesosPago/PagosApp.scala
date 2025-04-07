package com.meza.lozano.jorge.patterns.objectOriented.templateMethod.procesosPago

object PagosApp extends App {
  println("Pago con Tarjeta de Crédito:")
  val pagoTarjeta = new PagoTarjeta()
  pagoTarjeta.procesarPago()

  println("\nPago con PayPal:")
  val pagoPayPal = new PagoPayPal()
  pagoPayPal.procesarPago()
}
