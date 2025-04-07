package com.meza.lozano.jorge.patterns.objectOriented.command.controlRemoto

trait Comando {
  def ejecutar(): Unit
  def deshacer(): Unit
}
