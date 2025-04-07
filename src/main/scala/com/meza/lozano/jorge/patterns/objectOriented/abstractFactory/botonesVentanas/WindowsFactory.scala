package com.meza.lozano.jorge.patterns.objectOriented.abstractFactory.botonesVentanas

// Fábrica para Windows
class WindowsFactory extends GUIFactory {
  override def crearBoton(): Boton = new BotonWindows
  override def crearVentana(): Ventana = new VentanaWindows
}
