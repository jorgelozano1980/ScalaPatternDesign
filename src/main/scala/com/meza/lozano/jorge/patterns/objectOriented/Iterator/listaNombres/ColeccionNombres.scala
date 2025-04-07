package com.meza.lozano.jorge.patterns.objectOriented.Iterator.listaNombres

class ColeccionNombres(nombres: List[String]) {
  def obtenerIterador: Iterador[String] = new NombreIterador(nombres)
}
