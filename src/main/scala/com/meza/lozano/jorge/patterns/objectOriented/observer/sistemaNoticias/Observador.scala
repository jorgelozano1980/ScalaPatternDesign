package com.meza.lozano.jorge.patterns.objectOriented.observer.sistemaNoticias

trait Observador {
  def actualizar(noticia: String): Unit
}
