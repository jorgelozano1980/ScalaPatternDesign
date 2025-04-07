package com.meza.lozano.jorge.patterns.objectOriented.decorator.cafeteria

object CafeteriaApp extends App {
  val cafeSimple = new Cafe
  println(s"${cafeSimple.descripcion}: S/${cafeSimple.costo}")

  val cafeConLeche = new Leche(cafeSimple)
  println(s"${cafeConLeche.descripcion}: S/${cafeConLeche.costo}")

  val cafeDobleExtra = new Azucar(new Leche(cafeSimple))
  println(s"${cafeDobleExtra.descripcion}: S/${cafeDobleExtra.costo}")
}
