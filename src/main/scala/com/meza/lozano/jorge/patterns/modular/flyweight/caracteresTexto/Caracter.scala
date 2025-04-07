package com.meza.lozano.jorge.patterns.modular.flyweight.caracteresTexto

case class Caracter(letra: Char, posicion: Int, tipo: LetraTipo) {
  def mostrar(): Unit = {
    println(s"🔤 Letra '$letra' en posición $posicion con estilo '${tipo.fuente}', tamaño ${tipo.tamaño}")
  }
}
