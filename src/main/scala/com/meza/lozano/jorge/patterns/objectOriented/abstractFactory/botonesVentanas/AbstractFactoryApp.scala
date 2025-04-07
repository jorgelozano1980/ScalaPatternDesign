package com.meza.lozano.jorge.patterns.objectOriented.abstractFactory.botonesVentanas

object AbstractFactoryApp extends App {
  def inicializarInterfaz(factory: GUIFactory): Unit = {
    val boton = factory.crearBoton()
    val ventana = factory.crearVentana()

    boton.render()
    ventana.mostrar()
  }

  // Simulamos que el sistema detecta Windows
  val factory: GUIFactory = new WindowsFactory
  inicializarInterfaz(factory)

  // Simulamos que el sistema detecta Mac
  val factoryMac: GUIFactory = new MacFactory
  inicializarInterfaz(factoryMac)
}
