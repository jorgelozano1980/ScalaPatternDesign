package com.meza.lozano.jorge.patterns.objectOriented.templateMethod.bebidas

class Cafe extends BebidaCaliente {
  def agregarIngrediente(): Unit = println("Agregando café molido")
  def agregarExtras(): Unit = println("Agregando azúcar y leche")
}