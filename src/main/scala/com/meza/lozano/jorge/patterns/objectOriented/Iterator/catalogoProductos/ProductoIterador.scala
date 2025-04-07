package com.meza.lozano.jorge.patterns.objectOriented.Iterator.catalogoProductos

import com.meza.lozano.jorge.patterns.objectOriented.Iterator.listaNombres.Iterador

class ProductoIterador(productos: List[Producto], categoriaFiltro: Option[String] = None) extends Iterador[Producto] {
  private val productosFiltrados = categoriaFiltro match {
    case Some(categoria) => productos.filter(_.categoria == categoria)
    case None            => productos
  }

  private var posicion = 0

  def tieneSiguiente: Boolean = posicion < productosFiltrados.length

  def siguiente(): Producto = {
    if (tieneSiguiente) {
      val producto = productosFiltrados(posicion)
      posicion += 1
      producto
    } else {
      throw new NoSuchElementException("No hay más productos")
    }
  }
}
