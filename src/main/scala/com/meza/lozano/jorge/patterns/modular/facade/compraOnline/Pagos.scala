package com.meza.lozano.jorge.patterns.modular.facade.compraOnline

class Pagos {
  def procesarPago(monto: Double): Boolean = {
    println(s"💳 Procesando pago de $$${monto}...")
    true // Simulamos que el pago siempre es exitoso
  }
}
