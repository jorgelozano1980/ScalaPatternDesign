package com.meza.lozano.jorge.patterns.objectOriented.Iterator.listaNombres

trait Iterador[T] {
  def tieneSiguiente: Boolean
  def siguiente(): T
}
