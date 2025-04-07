package com.meza.lozano.jorge.patterns.objectOriented.command.editorTexto

class EditorTexto {
  private var texto: String = ""

  def escribir(nuevoTexto: String): Unit = {
    texto += nuevoTexto
    println(s"📄 Texto actual: '$texto'")
  }

  def borrar(cantidad: Int): Unit = {
    texto = texto.dropRight(cantidad)
    println(s"🗑️ Texto después de borrar: '$texto'")
  }

  def obtenerTexto: String = texto
}
