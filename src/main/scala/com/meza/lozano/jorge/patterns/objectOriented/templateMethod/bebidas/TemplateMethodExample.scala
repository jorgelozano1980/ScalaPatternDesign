package com.meza.lozano.jorge.patterns.objectOriented.templateMethod.bebidas

object TemplateMethodExample extends App {
  println("Preparando café:")
  val cafe = new Cafe()
  cafe.preparar()

  println("\nPreparando té:")
  val te = new Te()
  te.preparar()
}
