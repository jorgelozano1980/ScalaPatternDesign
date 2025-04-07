package com.meza.lozano.jorge.patterns.objectOriented.strategy.compresiónArchivos

trait EstrategiaCompresion {
  def comprimir(archivos: List[String]): Unit
}
