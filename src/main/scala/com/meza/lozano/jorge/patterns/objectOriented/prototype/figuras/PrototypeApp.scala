package com.meza.lozano.jorge.patterns.objectOriented.prototype.figuras

object PrototypeApp extends App {
  // Crear una figura original
  val circuloOriginal = Circulo(10, 20, 5)
  circuloOriginal.dibujar()

  // Clonar la figura
  val circuloClonado = circuloOriginal.clonar().asInstanceOf[Circulo]
  circuloClonado.x = 30 // Modificar la copia
  circuloClonado.dibujar()

  // Crear y clonar un rectángulo
  val rectanguloOriginal = Rectangulo(5, 5, 15, 10)
  rectanguloOriginal.dibujar()

  val rectanguloClonado = rectanguloOriginal.clonar().asInstanceOf[Rectangulo]
  rectanguloClonado.y = 25 // Modificar la copia
  rectanguloClonado.dibujar()
}
