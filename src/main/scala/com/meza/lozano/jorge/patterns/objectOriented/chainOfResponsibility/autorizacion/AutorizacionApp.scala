package com.meza.lozano.jorge.patterns.objectOriented.chainOfResponsibility.autorizacion

object AutorizacionApp extends App {
  val verificarUsuario = new VerificarUsuario
  val verificarPermisos = new VerificarPermisos
  val verificarAutenticacion = new VerificarAutenticacion

  // Configurar la cadena de filtros
  verificarUsuario.establecerSiguiente(verificarPermisos).establecerSiguiente(verificarAutenticacion)

  println("\n🔹 Intentando acceder con 'usuario_valido':")
  verificarUsuario.verificar("usuario_valido")

  println("\n🔹 Intentando acceder con 'usuario_invalido':")
  verificarUsuario.verificar("usuario_invalido")
}
