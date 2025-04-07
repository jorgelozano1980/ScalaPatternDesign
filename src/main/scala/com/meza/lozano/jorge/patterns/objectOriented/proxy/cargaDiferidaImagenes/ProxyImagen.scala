package com.meza.lozano.jorge.patterns.objectOriented.proxy.cargaDiferidaImagenes

class ProxyImagen(val archivo: String) extends Imagen {
  private var imagenReal: Option[ImagenReal] = None

  def mostrar(): Unit = {
    if (imagenReal.isEmpty) {
      imagenReal = Some(new ImagenReal(archivo)) // Carga diferida
    }
    imagenReal.get.mostrar()
  }
}
