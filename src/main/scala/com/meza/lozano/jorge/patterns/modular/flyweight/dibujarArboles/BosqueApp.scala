package com.meza.lozano.jorge.patterns.modular.flyweight.dibujarArboles

object BosqueApp extends App {
  val bosque = List(
    Arbol(10, 20, ArbolTipoFactory.obtenerTipo("Pino", "Verde", "Áspera")),
    Arbol(30, 40, ArbolTipoFactory.obtenerTipo("Pino", "Verde", "Áspera")),
    Arbol(50, 60, ArbolTipoFactory.obtenerTipo("Roble", "Marrón", "Lisa")),
    Arbol(70, 80, ArbolTipoFactory.obtenerTipo("Pino", "Verde", "Áspera"))
  )

  bosque.foreach(_.dibujar())

  println(s"Tipos de árboles creados: ${ArbolTipoFactory.tipos.size}")
}
