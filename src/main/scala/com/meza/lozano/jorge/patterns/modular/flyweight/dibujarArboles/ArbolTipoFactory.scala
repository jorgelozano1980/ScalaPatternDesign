package com.meza.lozano.jorge.patterns.modular.flyweight.dibujarArboles

import scala.collection.mutable

object ArbolTipoFactory {
  // Mapa privado para almacenar los tipos de árboles
  val tipos = scala.collection.mutable.Map[String, ArbolTipo]()

  // Método para obtener un tipo de árbol reutilizable
  def obtenerTipo(nombre: String, color: String, textura: String): ArbolTipo = {
    tipos.getOrElseUpdate(nombre, ArbolTipo(nombre, color, textura))
  }

  // Método público para obtener el número de tipos de árboles creados
  def contarTipos(): Int = {
    tipos.size
  }
}
