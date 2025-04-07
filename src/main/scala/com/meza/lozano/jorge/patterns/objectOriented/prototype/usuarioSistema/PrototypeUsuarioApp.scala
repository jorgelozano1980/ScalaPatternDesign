package com.meza.lozano.jorge.patterns.objectOriented.prototype.usuarioSistema

object PrototypeUsuarioApp extends App {
  val usuarioOriginal = Usuario("Carlos", 30, "carlos@email.com")
  println(s"👤 Usuario Original: $usuarioOriginal")

  val usuarioClonado = usuarioOriginal.clonar(cambioNombre = Some("Pedro"))
  println(s"👤 Usuario Clonado: $usuarioClonado")

  val usuarioCopia = usuarioOriginal.clonar(cambioEdad = Some(35))
  println(s"👤 Usuario Copia con Edad Modificada: $usuarioCopia")
}
