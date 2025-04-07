package com.meza.lozano.jorge.patterns.objectOriented.builder.pizza

object PizzaApp extends App {
  val pizza = new PizzaBuilder()
    .conTamaño("Grande")
    .conQueso()
    .conPepperoni()
    .construir()

  println(pizza)
}
