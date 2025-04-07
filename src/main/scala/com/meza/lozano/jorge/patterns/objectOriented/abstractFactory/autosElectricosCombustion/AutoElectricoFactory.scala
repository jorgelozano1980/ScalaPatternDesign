package com.meza.lozano.jorge.patterns.objectOriented.abstractFactory.autosElectricosCombustion

// Fábrica de autos eléctricos
class AutoElectricoFactory extends AutoFactory {
  override def crearMotor(): Motor = new MotorElectrico
  override def crearEnergia(): Energia = new Bateria
}
