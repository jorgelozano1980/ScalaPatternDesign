package com.meza.lozano.jorge.patterns.objectOriented.mediator.chat

object ChatApp extends App {
  val chat = new ChatConcreto()

  val usuario1 = new Usuario("Carlos", chat)
  val usuario2 = new Usuario("Ana", chat)
  val usuario3 = new Usuario("Luis", chat)

  chat.agregarUsuario(usuario1)
  chat.agregarUsuario(usuario2)
  chat.agregarUsuario(usuario3)

  usuario1.enviar("¡Hola a todos!")
}
