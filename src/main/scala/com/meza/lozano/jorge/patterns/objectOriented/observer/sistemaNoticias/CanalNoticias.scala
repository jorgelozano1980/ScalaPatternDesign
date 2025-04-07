package com.meza.lozano.jorge.patterns.objectOriented.observer.sistemaNoticias

class CanalNoticias extends Sujeto {
  def publicarNoticia(noticia: String): Unit = {
    println(s"📰 Nueva noticia: $noticia")
    notificarObservadores(noticia)
  }
}
