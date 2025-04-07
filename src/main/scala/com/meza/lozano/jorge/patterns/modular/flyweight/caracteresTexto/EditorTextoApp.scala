package com.meza.lozano.jorge.patterns.modular.flyweight.caracteresTexto

object EditorTextoApp extends App {
  val texto = List(
    Caracter('H', 0, LetraTipoFactory.obtenerLetraTipo("Arial", 12)),
    Caracter('o', 1, LetraTipoFactory.obtenerLetraTipo("Arial", 12)),
    Caracter('l', 2, LetraTipoFactory.obtenerLetraTipo("Arial", 12)),
    Caracter('a', 3, LetraTipoFactory.obtenerLetraTipo("Arial", 12)),
    Caracter('!', 4, LetraTipoFactory.obtenerLetraTipo("Times New Roman", 14))
  )

  texto.foreach(_.mostrar())

  println(s"Estilos de letra creados: ${LetraTipoFactory.tipos.size}")
}
