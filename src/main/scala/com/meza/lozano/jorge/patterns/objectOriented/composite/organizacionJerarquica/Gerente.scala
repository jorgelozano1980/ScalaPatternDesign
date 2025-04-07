package com.meza.lozano.jorge.patterns.objectOriented.composite.organizacionJerarquica

import scala.collection.mutable.ListBuffer

class Gerente(val nombre: String, val puesto: String) extends Empleado {
  private val subordinados = ListBuffer[Empleado]()

  def agregar(empleado: Empleado): Unit = subordinados += empleado
  def eliminar(empleado: Empleado): Unit = subordinados -= empleado

  def mostrar(indice: String): Unit = {
    println(s"$indice👔 $puesto: $nombre")
    subordinados.foreach(_.mostrar(indice + "  "))
  }
}
