package com.meza.lozano.jorge.patterns.objectOriented.composite.sistemaArchivos

class Archivo(val nombre: String) extends Elemento {
  def mostrar(indice: String): Unit = println(s"$indice📄 Archivo: $nombre")
}
