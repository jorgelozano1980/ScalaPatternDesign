package com.meza.lozano.jorge.patterns.objectOriented.mediator.chat

trait ChatMediator {
  def enviarMensaje(mensaje: String, usuario: Usuario): Unit
  def agregarUsuario(usuario: Usuario): Unit
}
