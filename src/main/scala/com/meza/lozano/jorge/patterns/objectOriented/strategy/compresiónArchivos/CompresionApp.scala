package com.meza.lozano.jorge.patterns.objectOriented.strategy.compresiónArchivos

object CompresionApp extends App {
  val gestor = new GestorCompresion
  val archivos = List("documento.txt", "imagen.jpg", "video.mp4")

  // Usar compresión ZIP
  gestor.setEstrategia(new CompresionZIP)
  gestor.comprimirArchivos(archivos)

  // Cambiar a compresión RAR
  gestor.setEstrategia(new CompresionRAR)
  gestor.comprimirArchivos(archivos)
}
