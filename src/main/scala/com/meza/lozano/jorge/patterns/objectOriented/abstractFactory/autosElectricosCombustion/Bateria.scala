package com.meza.lozano.jorge.patterns.objectOriented.abstractFactory.autosElectricosCombustion

// Energía
class Bateria extends Energia {
  override def cargar(): Unit = println("Cargando batería eléctrica")
}
