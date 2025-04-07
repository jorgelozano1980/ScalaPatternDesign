package com.meza.lozano.jorge.patterns.objectOriented.composite.organizacionJerarquica

object EmpresaApp extends App {
  val trabajador1 = new Trabajador("Ana", "Desarrolladora")
  val trabajador2 = new Trabajador("Carlos", "Diseñador")

  val gerente1 = new Gerente("María", "Gerente de Tecnología")
  gerente1.agregar(trabajador1)
  gerente1.agregar(trabajador2)

  val trabajador3 = new Trabajador("Pedro", "Analista")

  val director = new Gerente("Javier", "Director General")
  director.agregar(gerente1)
  director.agregar(trabajador3)

  director.mostrar()
}
