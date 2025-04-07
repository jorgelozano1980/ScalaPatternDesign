package com.meza.lozano.jorge.patterns.objectOriented.proxy.controlAcceso

class ProxyDocumento(usuario: String, contenido: String) extends Documento {
  private var documentoReal: Option[DocumentoReal] = None

  def mostrar(): Unit = {
    if (usuario == "admin") {
      if (documentoReal.isEmpty) {
        documentoReal = Some(new DocumentoReal(contenido)) // Carga diferida
      }
      documentoReal.get.mostrar()
    } else {
      println("⛔ Acceso denegado. Solo los administradores pueden ver el documento.")
    }
  }
}
