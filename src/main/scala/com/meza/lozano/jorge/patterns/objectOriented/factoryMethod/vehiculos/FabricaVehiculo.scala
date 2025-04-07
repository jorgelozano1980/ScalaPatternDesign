package com.meza.lozano.jorge.patterns.objectOriented.factoryMethod.vehiculos

abstract class FabricaVehiculo {
  // Método Factory que será implementado en las subclases
  def crearVehiculo(): Vehiculo
}
