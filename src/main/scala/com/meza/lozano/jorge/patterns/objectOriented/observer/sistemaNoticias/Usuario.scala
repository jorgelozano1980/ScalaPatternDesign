package com.meza.lozano.jorge.patterns.objectOriented.observer.sistemaNoticias

class Usuario(val nombre: String) extends Observador {
  def actualizar(noticia: String): Unit = {
    println(s"📩 $nombre ha recibido la noticia: $noticia")
  }
}
