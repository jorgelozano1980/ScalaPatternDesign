package com.meza.lozano.jorge.patterns.objectOriented.interpreter.expresionesMatematicas

object InterpreterApp extends App {
  // Representa la expresión: (5 + 3) - 2
  val expresion: Expresion = Resta(Suma(Numero(5), Numero(3)), Numero(2))

  // Interpretar la expresión
  println(s"Resultado: ${expresion.interpretar()}")
}
