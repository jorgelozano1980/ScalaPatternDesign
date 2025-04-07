package com.meza.lozano.jorge.patterns.modular.facade.compraOnline

class Envio {
  def enviarProducto(producto: String): Unit = {
    println(s"🚚 Enviando $producto al cliente...")
  }
}
