package com.meza.lozano.jorge.patterns.objectOriented.command.controlRemoto

class ComandoApagarRadio(radio: Radio) extends Comando {
  def ejecutar(): Unit = radio.apagar()
  def deshacer(): Unit = radio.encender()
}
