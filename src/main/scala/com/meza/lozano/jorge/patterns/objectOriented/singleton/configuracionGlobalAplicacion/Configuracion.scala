package com.meza.lozano.jorge.patterns.objectOriented.singleton.configuracionGlobalAplicacion

object Configuracion {
  private var configuraciones: Map[String, String] = Map(
    "modo" -> "producción",
    "version" -> "1.0.0"
  )

  def obtenerClave(clave: String): String = configuraciones.getOrElse(clave, "Clave no encontrada")
  def establecerClave(clave: String, valor: String): Unit = {
    configuraciones += (clave -> valor)
  }
}
