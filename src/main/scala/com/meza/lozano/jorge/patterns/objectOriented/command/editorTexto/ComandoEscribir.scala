package com.meza.lozano.jorge.patterns.objectOriented.command.editorTexto

class ComandoEscribir(editor: EditorTexto, texto: String) extends ComandoTexto {
  def ejecutar(): Unit = editor.escribir(texto)
  def deshacer(): Unit = editor.borrar(texto.length)
}
