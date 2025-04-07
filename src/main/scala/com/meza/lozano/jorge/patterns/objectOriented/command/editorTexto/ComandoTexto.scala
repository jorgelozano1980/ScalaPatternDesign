package com.meza.lozano.jorge.patterns.objectOriented.command.editorTexto

trait ComandoTexto {
  def ejecutar(): Unit
  def deshacer(): Unit
}
