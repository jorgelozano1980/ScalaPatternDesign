package com.meza.lozano.jorge.patterns.objectOriented.observer.monitoreoClima

object ClimaApp extends App {
  val sensor = new SensorTemperatura

  val pantalla = new Pantalla
  val alarma = new Alarma

  // Se suscriben dispositivos al sensor
  sensor.agregarDispositivo(pantalla)
  sensor.agregarDispositivo(alarma)

  // Se actualiza la temperatura
  sensor.setTemperatura(25.0)
  sensor.setTemperatura(35.0) // Esto activará la alarma
}
