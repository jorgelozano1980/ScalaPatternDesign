package com.meza.lozano.jorge.patterns.modular.flyweight.caracteresTexto

import scala.collection.mutable

object LetraTipoFactory {
  val tipos = mutable.Map[String, LetraTipo]()

  def obtenerLetraTipo(fuente: String, tamaño: Int): LetraTipo = {
    val clave = s"$fuente-$tamaño"
    tipos.getOrElseUpdate(clave, LetraTipo(fuente, tamaño))
  }
}
