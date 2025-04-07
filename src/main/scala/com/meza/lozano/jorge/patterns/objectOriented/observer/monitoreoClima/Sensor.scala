package com.meza.lozano.jorge.patterns.objectOriented.observer.monitoreoClima

trait Sensor {
  private var dispositivos: List[Dispositivo] = List()

  def agregarDispositivo(dispositivo: Dispositivo): Unit = {
    dispositivos = dispositivo :: dispositivos
  }

  def eliminarDispositivo(dispositivo: Dispositivo): Unit = {
    dispositivos = dispositivos.filterNot(_ == dispositivo)
  }

  def notificarDispositivos(temperatura: Double): Unit = {
    dispositivos.foreach(_.actualizar(temperatura))
  }
}
