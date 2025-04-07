package com.meza.lozano.jorge.patterns.objectOriented.proxy.cargaDiferidaImagenes

object GaleriaApp extends App {
  val imagen1 = new ProxyImagen("paisaje.jpg")
  val imagen2 = new ProxyImagen("ciudad.jpg")

  println("Mostrando primera imagen:")
  imagen1.mostrar() // Carga y muestra la imagen

  println("\nMostrando segunda imagen:")
  imagen2.mostrar() // Carga y muestra la imagen

  println("\nMostrando primera imagen otra vez:")
  imagen1.mostrar() // No vuelve a cargar, solo muestra
}
