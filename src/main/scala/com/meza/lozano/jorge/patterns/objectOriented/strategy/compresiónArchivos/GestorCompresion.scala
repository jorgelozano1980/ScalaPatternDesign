package com.meza.lozano.jorge.patterns.objectOriented.strategy.compresiónArchivos

class GestorCompresion {
  private var estrategia: EstrategiaCompresion = _

  def setEstrategia(nuevaEstrategia: EstrategiaCompresion): Unit = {
    estrategia = nuevaEstrategia
  }

  def comprimirArchivos(archivos: List[String]): Unit = {
    if (estrategia == null) {
      println("⚠️ No se ha seleccionado un método de compresión.")
    } else {
      estrategia.comprimir(archivos)
    }
  }
}
