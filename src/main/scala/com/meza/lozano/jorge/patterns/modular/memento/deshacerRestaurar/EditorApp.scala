package com.meza.lozano.jorge.patterns.modular.memento.deshacerRestaurar

object EditorApp extends App {
  val editor = new EditorTexto()
  val historial = new AdministradorHistorial()

  editor.escribir("Hola, ")
  historial.guardarMemento(editor.guardar())

  editor.escribir("mundo!")
  historial.guardarMemento(editor.guardar())

  editor.mostrar() // 📄 Contenido: Hola, mundo!

  println("🔄 Deshaciendo cambios...")
  historial.deshacer().foreach(editor.restaurar)
  editor.mostrar() // 📄 Contenido: Hola,

  println("🔄 Deshaciendo más cambios...")
  historial.deshacer().foreach(editor.restaurar)
  editor.mostrar() // 📄 Contenido: (vacío)
}
