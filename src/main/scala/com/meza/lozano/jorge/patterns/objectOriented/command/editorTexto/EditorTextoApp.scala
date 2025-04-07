package com.meza.lozano.jorge.patterns.objectOriented.command.editorTexto

object EditorTextoApp extends App {
  val editor = new EditorTexto
  val adminComandos = new AdministradorComandos

  val escribirHola = new ComandoEscribir(editor, "Hola ")
  val escribirMundo = new ComandoEscribir(editor, "Mundo!")

  // Escribir texto
  adminComandos.ejecutarComando(escribirHola)
  adminComandos.ejecutarComando(escribirMundo)

  // Deshacer la última acción
  adminComandos.deshacer()

  // Deshacer otra vez
  adminComandos.deshacer()
}
