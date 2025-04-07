package com.meza.lozano.jorge.patterns.objectOriented.abstractFactory.autosElectricosCombustion

// Fábrica de autos de combustión
class AutoCombustionFactory extends AutoFactory {
  override def crearMotor(): Motor = new MotorCombustion
  override def crearEnergia(): Energia = new TanqueGasolina
}
