package com.meza.lozano.jorge.patterns.objectOriented.factoryMethod.vehiculos

class FabricaMoto extends FabricaVehiculo {
  def crearVehiculo(): Vehiculo = new Moto()
}
