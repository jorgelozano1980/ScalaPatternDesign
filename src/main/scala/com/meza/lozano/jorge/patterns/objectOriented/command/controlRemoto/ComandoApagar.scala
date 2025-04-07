package com.meza.lozano.jorge.patterns.objectOriented.command.controlRemoto

class ComandoApagar(tv: Televisor) extends Comando {
  def ejecutar(): Unit = tv.apagar()
  def deshacer(): Unit = tv.encender()
}
