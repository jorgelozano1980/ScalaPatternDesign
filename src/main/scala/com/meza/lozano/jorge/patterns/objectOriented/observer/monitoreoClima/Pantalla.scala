package com.meza.lozano.jorge.patterns.objectOriented.observer.monitoreoClima

class Pantalla extends Dispositivo {
  def actualizar(temperatura: Double): Unit = {
    println(s"📺 La pantalla muestra la nueva temperatura: $temperatura°C")
  }
}
