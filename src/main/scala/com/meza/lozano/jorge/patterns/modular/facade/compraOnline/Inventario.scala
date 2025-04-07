package com.meza.lozano.jorge.patterns.modular.facade.compraOnline

class Inventario {
  def verificarProducto(producto: String): Boolean = {
    println(s"📦 Verificando stock de $producto...")
    true // Simulamos que siempre hay stock
  }
}
