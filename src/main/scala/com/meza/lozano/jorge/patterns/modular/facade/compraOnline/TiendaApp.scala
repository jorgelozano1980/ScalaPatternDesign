package com.meza.lozano.jorge.patterns.modular.facade.compraOnline

object TiendaApp extends App {
  val tienda = new CompraFacade()

  tienda.comprarProducto("Laptop", 1200.0)
}
