package com.meza.lozano.jorge.patterns.objectOriented.singleton.configuracionGlobalAplicacion

object ConfigApp extends App {
  println(s"Modo: ${Configuracion.obtenerClave("modo")}")
  println(s"Versión: ${Configuracion.obtenerClave("version")}")

  Configuracion.establecerClave("modo", "desarrollo")
  println(s"Modo actualizado: ${Configuracion.obtenerClave("modo")}")
}
