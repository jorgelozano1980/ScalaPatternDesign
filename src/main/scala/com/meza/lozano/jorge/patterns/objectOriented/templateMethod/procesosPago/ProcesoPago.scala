package com.meza.lozano.jorge.patterns.objectOriented.templateMethod.procesosPago

abstract class ProcesoPago {
  final def procesarPago(): Unit = {
    validarDatos()
    procesar()
    enviarConfirmacion()
  }

  def validarDatos(): Unit = println("Validando datos de pago...")
  def enviarConfirmacion(): Unit = println("Enviando confirmación de pago...")

  // Método específico a ser implementado en cada subclase
  def procesar(): Unit
}
