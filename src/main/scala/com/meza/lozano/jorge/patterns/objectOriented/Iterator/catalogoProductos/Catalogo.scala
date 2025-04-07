package com.meza.lozano.jorge.patterns.objectOriented.Iterator.catalogoProductos

import com.meza.lozano.jorge.patterns.objectOriented.Iterator.listaNombres.Iterador

class Catalogo(productos: List[Producto]) {
  def obtenerIterador(categoria: Option[String] = None): Iterador[Producto] =
    new ProductoIterador(productos, categoria)
}
