package com.meza.lozano.jorge.patterns.modular.adapter.sistemaAudio

object AudioApp extends App {
  val auricularesUSB = new AuricularesUSB()
  val adaptador = new AdaptadorUSB_A_Jack(auricularesUSB)

  println("🎧 Conectando auriculares al sistema de audio...")
  adaptador.conectarJack()
}
