package com.meza.lozano.jorge.patterns.objectOriented.visitor.calculoPrecioDescuento

object TiendaApp extends App {
  val productos: List[Producto] = List(
    new Electronico(1000.0),
    new Ropa(200.0)
  )

  val descuentoVisitor = new DescuentoEspecial

  productos.foreach { producto =>
    println(s"Precio final: ${producto.aceptar(descuentoVisitor)}")
  }
}
