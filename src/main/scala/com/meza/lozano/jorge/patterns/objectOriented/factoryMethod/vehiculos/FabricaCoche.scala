package com.meza.lozano.jorge.patterns.objectOriented.factoryMethod.vehiculos

class FabricaCoche extends FabricaVehiculo {
  def crearVehiculo(): Vehiculo = new Coche()
}
