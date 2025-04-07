package com.meza.lozano.jorge.patterns.objectOriented.command.controlRemoto

class ControlRemoto {
  private var comandoActual: Option[Comando] = None

  def configurarComando(comando: Comando): Unit = {
    comandoActual = Some(comando)
  }

  def presionarBoton(): Unit = {
    comandoActual.foreach(_.ejecutar())
  }

  def presionarBotonDeshacer(): Unit = {
    comandoActual.foreach(_.deshacer())
  }
}
