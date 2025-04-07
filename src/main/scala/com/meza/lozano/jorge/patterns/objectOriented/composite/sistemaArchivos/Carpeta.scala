package com.meza.lozano.jorge.patterns.objectOriented.composite.sistemaArchivos

import scala.collection.mutable.ListBuffer

class Carpeta(val nombre: String) extends Elemento {
  private val elementos = ListBuffer[Elemento]()

  def agregar(elemento: Elemento): Unit = elementos += elemento
  def eliminar(elemento: Elemento): Unit = elementos -= elemento

  def mostrar(indice: String): Unit = {
    println(s"$indice📂 Carpeta: $nombre")
    elementos.foreach(_.mostrar(indice + "  "))
  }
}
