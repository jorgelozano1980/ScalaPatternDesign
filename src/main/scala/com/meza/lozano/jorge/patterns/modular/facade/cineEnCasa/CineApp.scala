package com.meza.lozano.jorge.patterns.modular.facade.cineEnCasa

object CineApp extends App {
  val cineEnCasa = new CineEnCasaFacade()

  cineEnCasa.verPelicula("Inception")
  println("\n⏹️ Terminar la película...\n")
  cineEnCasa.apagarTodo()
}
