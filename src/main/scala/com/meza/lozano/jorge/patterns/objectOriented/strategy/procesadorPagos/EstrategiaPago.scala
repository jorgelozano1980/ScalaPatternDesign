package com.meza.lozano.jorge.patterns.objectOriented.strategy.procesadorPagos

trait EstrategiaPago {
  def pagar(monto: Double): Unit
}
