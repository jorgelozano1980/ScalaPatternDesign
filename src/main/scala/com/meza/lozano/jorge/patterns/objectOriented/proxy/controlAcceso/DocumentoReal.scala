package com.meza.lozano.jorge.patterns.objectOriented.proxy.controlAcceso

class DocumentoReal(val contenido: String) extends Documento {
  def mostrar(): Unit = println(s"📄 Mostrando documento: $contenido")
}
