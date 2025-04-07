package com.meza.lozano.jorge.patterns.objectOriented.observer.monitoreoClima

class SensorTemperatura extends Sensor {
  def setTemperatura(nuevaTemperatura: Double): Unit = {
    println(s"🌡️ Nueva temperatura registrada: $nuevaTemperatura°C")
    notificarDispositivos(nuevaTemperatura)
  }
}
