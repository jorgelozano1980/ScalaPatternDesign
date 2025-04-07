package com.meza.lozano.jorge.patterns.objectOriented.templateMethod.procesosPago

class PagoPayPal extends ProcesoPago {
  def procesar(): Unit = println("Procesando pago con PayPal")
}
