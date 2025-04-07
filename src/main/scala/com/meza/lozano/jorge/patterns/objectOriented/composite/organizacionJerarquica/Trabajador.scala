package com.meza.lozano.jorge.patterns.objectOriented.composite.organizacionJerarquica

class Trabajador(val nombre: String, val puesto: String) extends Empleado {
  def mostrar(indice: String): Unit = println(s"$indice👤 $puesto: $nombre")
}
