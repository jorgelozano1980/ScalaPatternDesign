package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.soporteTecnico

object SoporteApp extends App {
  val soporteBasico = new SoporteBasico
  val soporteTecnico = new SoporteTecnico
  val gerente = new Gerente

  // Definir la cadena de responsabilidad
  soporteBasico.establecerSiguiente(soporteTecnico).establecerSiguiente(gerente)

  // Solicitudes
  println("\n🔹 Cliente solicita ayuda con 'consulta básica':")
  soporteBasico.manejarSolicitud("consulta básica")

  println("\n🔹 Cliente solicita ayuda con 'problema técnico':")
  soporteBasico.manejarSolicitud("problema técnico")

  println("\n🔹 Cliente solicita ayuda con 'reclamo importante':")
  soporteBasico.manejarSolicitud("reclamo importante")
}

