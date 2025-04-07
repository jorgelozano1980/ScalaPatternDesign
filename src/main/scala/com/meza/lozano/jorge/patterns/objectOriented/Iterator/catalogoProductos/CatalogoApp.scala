package com.meza.lozano.jorge.patterns.objectOriented.Iterator.catalogoProductos

object CatalogoApp extends App {
  val productos = List(
    Producto("Laptop", "Electrónica"),
    Producto("Silla", "Muebles"),
    Producto("Teléfono", "Electrónica"),
    Producto("Mesa", "Muebles")
  )

  val catalogo = new Catalogo(productos)
  val iteradorElectr = catalogo.obtenerIterador(Some("Electrónica"))

  println("Productos de la categoría Electrónica:")
  while (iteradorElectr.tieneSiguiente) {
    println(iteradorElectr.siguiente().nombre)
  }
}
