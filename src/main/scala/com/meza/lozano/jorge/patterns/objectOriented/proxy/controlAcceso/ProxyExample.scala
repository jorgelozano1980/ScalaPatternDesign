package com.meza.lozano.jorge.patterns.objectOriented.proxy.controlAcceso

object ProxyExample extends App {
  val documentoUsuario = new ProxyDocumento("usuario", "Informe Secreto")
  documentoUsuario.mostrar() // Acceso denegado

  val documentoAdmin = new ProxyDocumento("admin", "Informe Secreto")
  documentoAdmin.mostrar() // Acceso permitido
}
