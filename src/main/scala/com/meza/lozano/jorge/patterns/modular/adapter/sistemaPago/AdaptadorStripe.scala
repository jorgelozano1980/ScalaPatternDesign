package com.meza.lozano.jorge.patterns.modular.adapter.sistemaPago

class AdaptadorStripe(stripe: StripeAPI) extends PasarelaPago {
  override def pagar(monto: Double): Unit = {
    println("🔄 Adaptador Stripe en uso...")
    stripe.realizarPago(monto)
  }
}
