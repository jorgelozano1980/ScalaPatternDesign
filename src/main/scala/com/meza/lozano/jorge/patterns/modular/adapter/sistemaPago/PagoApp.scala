package com.meza.lozano.jorge.patterns.modular.adapter.sistemaPago

object PagoApp extends App {
  val stripe = new StripeAPI()
  val adaptadorStripe = new AdaptadorStripe(stripe)

  println("🛒 Procesando pago...")
  adaptadorStripe.pagar(50.0)
}
