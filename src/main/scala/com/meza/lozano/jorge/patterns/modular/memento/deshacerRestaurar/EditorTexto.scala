package com.meza.lozano.jorge.patterns.modular.memento.deshacerRestaurar

class EditorTexto {
  private var contenido: String = ""

  def escribir(texto: String): Unit = {
    contenido += texto
  }

  def mostrar(): Unit = {
    println(s"📄 Contenido: $contenido")
  }

  // Guardar estado en un Memento
  def guardar(): Memento = Memento(contenido)

  // Restaurar estado desde un Memento
  def restaurar(memento: Memento): Unit = {
    contenido = memento.estado
  }
}
