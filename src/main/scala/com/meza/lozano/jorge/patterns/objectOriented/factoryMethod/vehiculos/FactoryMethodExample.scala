package com.meza.lozano.jorge.patterns.objectOriented.factoryMethod.vehiculos

object FactoryMethodExample extends App {
  val fabricaCoche: FabricaVehiculo = new FabricaCoche()
  val coche: Vehiculo = fabricaCoche.crearVehiculo()
  coche.conducir()

  val fabricaMoto: FabricaVehiculo = new FabricaMoto()
  val moto: Vehiculo = fabricaMoto.crearVehiculo()
  moto.conducir()
}
