package com.meza.lozano.jorge.patterns.objectOriented.mediator.chat

class Usuario(val nombre: String, mediator: ChatMediator) {
  def enviar(mensaje: String): Unit = {
    println(s"📤 $nombre envía: $mensaje")
    mediator.enviarMensaje(mensaje, this)
  }

  def recibir(mensaje: String): Unit = {
    println(s"📩 $nombre recibe: $mensaje")
  }
}
