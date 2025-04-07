package com.meza.lozano.jorge.patterns.objectOriented.command.editorTexto

class AdministradorComandos {
  private var historial: List[ComandoTexto] = List()

  def ejecutarComando(comando: ComandoTexto): Unit = {
    comando.ejecutar()
    historial = comando :: historial
  }

  def deshacer(): Unit = {
    if (historial.nonEmpty) {
      historial.head.deshacer()
      historial = historial.tail
    } else {
      println("❌ No hay acciones para deshacer.")
    }
  }
}
