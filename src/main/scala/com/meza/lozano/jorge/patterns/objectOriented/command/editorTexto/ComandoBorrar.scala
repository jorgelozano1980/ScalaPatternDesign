package com.meza.lozano.jorge.patterns.objectOriented.command.editorTexto

class ComandoBorrar(editor: EditorTexto, cantidad: Int) extends ComandoTexto {
  private var textoEliminado: String = ""

  def ejecutar(): Unit = {
    textoEliminado = editor.obtenerTexto.takeRight(cantidad)
    editor.borrar(cantidad)
  }

  def deshacer(): Unit = editor.escribir(textoEliminado)
}
