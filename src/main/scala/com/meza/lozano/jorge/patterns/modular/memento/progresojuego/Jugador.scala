package com.meza.lozano.jorge.patterns.modular.memento.progresojuego

class Jugador(var vida: Int, var nivel: Int, var experiencia: Int) {

  def jugar(): Unit = {
    vida -= 10 // Recibe daño
    experiencia += 20 // Gana experiencia
    if (experiencia >= 100) {
      nivel += 1
      experiencia = 0
    }
  }

  def mostrarEstado(): Unit = {
    println(s"🎮 Jugador -> Vida: $vida | Nivel: $nivel | Experiencia: $experiencia")
  }

  // Guardar estado en un Memento
  def guardar(): Memento = Memento(vida, nivel, experiencia)

  // Restaurar estado desde un Memento
  def restaurar(memento: Memento): Unit = {
    vida = memento.vida
    nivel = memento.nivel
    experiencia = memento.experiencia
  }
}
