package com.meza.lozano.jorge.patterns.objectOriented.observer.monitoreoClima

class Alarma extends Dispositivo {
  def actualizar(temperatura: Double): Unit = {
    if (temperatura > 30) println(s"🚨 ¡Alerta! Temperatura muy alta: $temperatura°C")
  }
}
