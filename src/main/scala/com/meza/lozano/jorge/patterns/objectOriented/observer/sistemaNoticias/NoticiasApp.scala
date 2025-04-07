package com.meza.lozano.jorge.patterns.objectOriented.observer.sistemaNoticias

object NoticiasApp extends App {
  val canal = new CanalNoticias

  val usuario1 = new Usuario("Ana")
  val usuario2 = new Usuario("Carlos")

  // Los usuarios se suscriben al canal
  canal.agregarObservador(usuario1)
  canal.agregarObservador(usuario2)

  // Se publica una noticia
  canal.publicarNoticia("¡Scala 3 ha sido lanzado!")

  // Un usuario se desuscribe y se publica otra noticia
  canal.eliminarObservador(usuario1)
  canal.publicarNoticia("El mercado de IA sigue en crecimiento.")
}
