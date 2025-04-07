package com.meza.lozano.jorge.patterns.objectOriented.abstractFactory.botonesVentanas

// Fábrica para Mac
class MacFactory extends GUIFactory {
  override def crearBoton(): Boton = new BotonMac
  override def crearVentana(): Ventana = new VentanaMac
}
