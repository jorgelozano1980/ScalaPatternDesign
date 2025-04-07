package com.meza.lozano.jorge.patterns.objectOriented.proxy.cargaDiferidaImagenes

class ImagenReal(val archivo: String) extends Imagen {
  println(s"📂 Cargando imagen desde disco: $archivo") // Simula carga pesada

  def mostrar(): Unit = println(s"🖼️ Mostrando imagen: $archivo")
}
