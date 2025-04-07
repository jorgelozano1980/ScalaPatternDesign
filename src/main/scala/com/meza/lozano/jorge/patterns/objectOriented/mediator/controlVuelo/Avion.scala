package com.meza.lozano.jorge.patterns.objectOriented.mediator.controlVuelo

class Avion(val nombre: String, torre: TorreControl) {
  def enviarMensaje(mensaje: String): Unit = {
    println(s"🛫 $nombre envía: $mensaje")
    torre.notificar(this, mensaje)
  }

  def recibirMensaje(mensaje: String): Unit = {
    println(s"🛬 $nombre recibe: $mensaje")
  }
}
