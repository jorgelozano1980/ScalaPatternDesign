package com.meza.lozano.jorge.patterns.objectOriented.abstractFactory.autosElectricosCombustion

object AbstractFactoryAutoApp extends App {
  def construirAuto(factory: AutoFactory): Unit = {
    val motor = factory.crearMotor()
    val energia = factory.crearEnergia()

    motor.encender()
    energia.cargar()
  }

  // Crear auto eléctrico
  println("🚗 Construyendo Auto Eléctrico:")
  val factoryElectrico: AutoFactory = new AutoElectricoFactory
  construirAuto(factoryElectrico)

  // Crear auto de combustión
  println("\n🚗 Construyendo Auto de Combustión:")
  val factoryCombustion: AutoFactory = new AutoCombustionFactory
  construirAuto(factoryCombustion)
}
