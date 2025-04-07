package com.meza.lozano.jorge.patterns.objectOriented.command.controlRemoto

class ComandoEncenderRadio(radio: Radio) extends Comando {
  def ejecutar(): Unit = radio.encender()
  def deshacer(): Unit = radio.apagar()
}
