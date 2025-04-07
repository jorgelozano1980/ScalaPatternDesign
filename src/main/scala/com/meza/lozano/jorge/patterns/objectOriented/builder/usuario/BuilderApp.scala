package com.meza.lozano.jorge.patterns.objectOriented.builder.usuario

object BuilderApp extends App {
  val usuario = new UsuarioBuilder()
    .conNombre("Carlos")
    .conEdad(30)
    .conEmail("carlos@email.com")
    .construir()

  println(usuario)
}
