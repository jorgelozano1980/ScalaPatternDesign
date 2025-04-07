package com.meza.lozano.jorge.patterns.objectOriented.Iterator.listaNombres

object IteratorExample extends App {
  val nombres = new ColeccionNombres(List("Ana", "Carlos", "Elena", "Pedro"))
  val iterador = nombres.obtenerIterador

  while (iterador.tieneSiguiente) {
    println(s"Nombre: ${iterador.siguiente()}")
  }
}
