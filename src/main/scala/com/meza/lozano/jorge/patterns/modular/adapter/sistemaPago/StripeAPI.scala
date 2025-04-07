package com.meza.lozano.jorge.patterns.modular.adapter.sistemaPago

class StripeAPI {
  def realizarPago(monto: Double): Unit = {
    println(s"💰 Pago de $$${monto} realizado con Stripe")
  }
}
