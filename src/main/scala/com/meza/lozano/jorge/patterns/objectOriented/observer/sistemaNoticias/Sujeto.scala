package com.meza.lozano.jorge.patterns.objectOriented.observer.sistemaNoticias

trait Sujeto {
  private var observadores: List[Observador] = List()

  def agregarObservador(observador: Observador): Unit = {
    observadores = observador :: observadores
  }

  def eliminarObservador(observador: Observador): Unit = {
    observadores = observadores.filterNot(_ == observador)
  }

  def notificarObservadores(noticia: String): Unit = {
    observadores.foreach(_.actualizar(noticia))
  }
}

