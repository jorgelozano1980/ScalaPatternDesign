package com.meza.lozano.jorge.patterns.objectOriented.strategy.compresiónArchivos

class CompresionRAR extends EstrategiaCompresion {
  def comprimir(archivos: List[String]): Unit = {
    println(s"🗜️ Comprimiendo ${archivos.mkString(", ")} en formato RAR.")
  }
}
