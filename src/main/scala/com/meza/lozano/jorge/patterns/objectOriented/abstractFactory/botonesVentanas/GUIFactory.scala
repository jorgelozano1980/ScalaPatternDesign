package com.meza.lozano.jorge.patterns.objectOriented.abstractFactory.botonesVentanas

// Fábrica abstracta
trait GUIFactory {
  def crearBoton(): Boton
  def crearVentana(): Ventana
}
