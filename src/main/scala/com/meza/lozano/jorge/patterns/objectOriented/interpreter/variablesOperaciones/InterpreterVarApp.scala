package com.meza.lozano.jorge.patterns.objectOriented.interpreter.variablesOperaciones

object InterpreterVarApp extends App {
  implicit val contexto = new Contexto
  contexto.asignar("x", 10)
  contexto.asignar("y", 4)

  // Expresión: (x + y) - 2  → (10 + 4) - 2
  val expresion: Expresion = RestaVar(SumaVar(Variable("x"), Variable("y")), Numero(2))

  // Interpretar la expresión con contexto
  println(s"Resultado: ${expresion.interpretar()}")
}
