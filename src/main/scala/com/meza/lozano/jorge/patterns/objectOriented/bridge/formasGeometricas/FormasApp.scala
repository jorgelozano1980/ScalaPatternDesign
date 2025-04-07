package com.meza.lozano.jorge.patterns.objectOriented.bridge.formasGeometricas

object FormasApp extends App {
  val circuloRojo = new Circulo(new Rojo)
  val cuadradoAzul = new Cuadrado(new Azul)

  circuloRojo.dibujar()  // ⚪ Círculo de color 🔴 Rojo
  cuadradoAzul.dibujar()  // ⬜ Cuadrado de color 🔵 Azul
}
