package com.meza.lozano.jorge.patterns.objectOriented.command.controlRemoto

class ComandoEncender(tv: Televisor) extends Comando {
  def ejecutar(): Unit = tv.encender()
  def deshacer(): Unit = tv.apagar()
}
