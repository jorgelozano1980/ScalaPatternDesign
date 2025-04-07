package com.meza.lozano.jorge.patterns.objectOriented.abstractFactory.autosElectricosCombustion

// Fábrica abstracta
trait AutoFactory {
  def crearMotor(): Motor
  def crearEnergia(): Energia
}
