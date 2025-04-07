package com.meza.lozano.jorge.patterns.objectOriented.state.puertaEstados

object PuertaApp extends App {
  val puerta = new Puerta

  puerta.cerrar() // ⚠️ La puerta ya está cerrada.
  puerta.abrir() // 🚪 Puerta abierta.
  puerta.abrir() // ⚠️ La puerta ya está abierta.
  puerta.cerrar() // 🔒 Puerta cerrada.
  puerta.cerrar() // ⚠️ La puerta ya está cerrada.
}
