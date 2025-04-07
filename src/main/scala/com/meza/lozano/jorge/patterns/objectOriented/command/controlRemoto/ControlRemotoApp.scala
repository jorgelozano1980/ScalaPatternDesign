package com.meza.lozano.jorge.patterns.objectOriented.command.controlRemoto

object ControlRemotoApp extends App {
  val tv = new Televisor
  val radio = new Radio

  val comandoEncenderTV = new ComandoEncender(tv)
  val comandoApagarTV = new ComandoApagar(tv)
  val comandoEncenderRadio = new ComandoEncenderRadio(radio)
  val comandoApagarRadio = new ComandoApagarRadio(radio)

  val control = new ControlRemoto

  // Encender la TV
  control.configurarComando(comandoEncenderTV)
  control.presionarBoton()

  // Apagar la TV
  control.configurarComando(comandoApagarTV)
  control.presionarBoton()

  // Encender la Radio
  control.configurarComando(comandoEncenderRadio)
  control.presionarBoton()

  // Deshacer (apagar la radio)
  control.presionarBotonDeshacer()
}
