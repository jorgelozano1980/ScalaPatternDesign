package com.meza.lozano.jorge.patterns.objectOriented.templateMethod.procesosPago

class PagoTarjeta extends ProcesoPago {
  def procesar(): Unit = println("Procesando pago con Tarjeta de Crédito")
}
