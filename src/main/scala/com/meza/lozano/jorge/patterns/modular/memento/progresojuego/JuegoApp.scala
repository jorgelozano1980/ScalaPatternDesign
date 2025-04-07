package com.meza.lozano.jorge.patterns.modular.memento.progresojuego

object JuegoApp extends App {
  val jugador = new Jugador(100, 1, 0)
  val administrador = new AdministradorGuardado()

  jugador.mostrarEstado() // 🎮 Vida: 100 | Nivel: 1 | Experiencia: 0

  println("🕹️ Jugando...")
  jugador.jugar()
  jugador.mostrarEstado() // 🎮 Vida: 90 | Nivel: 1 | Experiencia: 20

  administrador.guardarPartida(jugador.guardar())

  println("🕹️ Jugando más...")
  jugador.jugar()
  jugador.jugar()
  jugador.jugar()
  jugador.mostrarEstado() // 🎮 Vida: 60 | Nivel: 1 | Experiencia: 80

  println("❌ Jugador se equivoca y quiere cargar partida...")
  administrador.cargarPartida().foreach(jugador.restaurar)

  jugador.mostrarEstado() // 🎮 Vida: 90 | Nivel: 1 | Experiencia: 20
}
