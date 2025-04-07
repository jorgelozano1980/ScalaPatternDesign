package com.meza.lozano.jorge.patterns.modular.facade.cineEnCasa

class SistemaSonido {
  def encender(): Unit = println("🔊 Sistema de sonido encendido")
  def apagar(): Unit = println("🔊 Sistema de sonido apagado")
  def ajustarVolumen(nivel: Int): Unit = println(s"🔊 Volumen ajustado a $nivel")
}
