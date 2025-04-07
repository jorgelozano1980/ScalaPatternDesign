package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.autorizacion

trait Filtro {
  def establecerSiguiente(siguiente: Filtro): Filtro
  def verificar(credenciales: String): Boolean
}
