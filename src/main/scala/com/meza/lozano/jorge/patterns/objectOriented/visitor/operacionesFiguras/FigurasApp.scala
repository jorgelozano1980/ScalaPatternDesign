package com.meza.lozano.jorge.patterns.objectOriented.visitor.operacionesFiguras

object FigurasApp extends App {
  val figuras: List[Figura] = List(
    new Circulo(5),
    new Rectangulo(4, 6)
  )

  val calculadora = new CalculadoraArea

  figuras.foreach { figura =>
    println(s"Área calculada: ${figura.aceptar(calculadora)}")
  }
}
