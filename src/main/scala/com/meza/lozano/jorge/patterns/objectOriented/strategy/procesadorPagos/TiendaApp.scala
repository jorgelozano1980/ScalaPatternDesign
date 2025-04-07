package com.meza.lozano.jorge.patterns.objectOriented.strategy.procesadorPagos

object TiendaApp extends App {
  val tienda = new TiendaOnline

  // Elegir estrategia de pago con tarjeta
  tienda.setEstrategia(new PagoConTarjeta("1234-5678-9876-5432"))
  tienda.procesarPago(50.0)

  // Cambiar estrategia a PayPal
  tienda.setEstrategia(new PagoConPayPal("usuario@example.com"))
  tienda.procesarPago(75.0)
}
