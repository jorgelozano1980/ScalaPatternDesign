package com.meza.lozano.jorge.patterns.objectOriented.mediator.chat

import scala.collection.mutable.ListBuffer

class ChatConcreto extends ChatMediator {
  private val usuarios = ListBuffer[Usuario]()

  def agregarUsuario(usuario: Usuario): Unit = {
    usuarios += usuario
  }

  def enviarMensaje(mensaje: String, usuario: Usuario): Unit = {
    usuarios.foreach(u => if (u != usuario) u.recibir(mensaje))
  }
}
