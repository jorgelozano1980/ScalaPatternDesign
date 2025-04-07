package com.meza.lozano.jorge.patterns.modular.facade.cineEnCasa

class CineEnCasaFacade {
  private val televisor = new Televisor()
  private val bluRay = new ReproductorBluRay()
  private val sonido = new SistemaSonido()

  def verPelicula(pelicula: String): Unit = {
    println("🎬 Preparando el sistema para ver una película...")
    televisor.encender()
    sonido.encender()
    sonido.ajustarVolumen(8)
    bluRay.encender()
    bluRay.reproducir(pelicula)
  }

  def apagarTodo(): Unit = {
    println("🔌 Apagando todo el sistema...")
    bluRay.apagar()
    sonido.apagar()
    televisor.apagar()
  }
}
