package com.meza.lozano.jorge.patterns.modular.facade.cineEnCasa

class ReproductorBluRay {
  def encender(): Unit = println("💿 Reproductor Blu-ray encendido")
  def apagar(): Unit = println("💿 Reproductor Blu-ray apagado")
  def reproducir(pelicula: String): Unit = println(s"▶️ Reproduciendo $pelicula")
}
