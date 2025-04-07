package com.meza.lozano.jorge.patterns.objectOriented.Iterator.listaNombres

class NombreIterador(nombres: List[String]) extends Iterador[String] {
  private var posicion = 0

  def tieneSiguiente: Boolean = posicion < nombres.length

  def siguiente(): String = {
    if (tieneSiguiente) {
      val nombre = nombres(posicion)
      posicion += 1
      nombre
    } else {
      throw new NoSuchElementException("No hay más elementos")
    }
  }
}
