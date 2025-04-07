package com.meza.lozano.jorge.patterns.objectOriented.templateMethod.bebidas

abstract class BebidaCaliente {
  // Método plantilla
  final def preparar(): Unit = {
    hervirAgua()
    agregarIngrediente()
    verterEnTaza()
    agregarExtras()
  }

  // Métodos generales
  def hervirAgua(): Unit = println("Hirviendo agua")

  def verterEnTaza(): Unit = println("Vertiendo en la taza")

  // Métodos que varían según la bebida (abstractos)
  def agregarIngrediente(): Unit

  def agregarExtras(): Unit
}
