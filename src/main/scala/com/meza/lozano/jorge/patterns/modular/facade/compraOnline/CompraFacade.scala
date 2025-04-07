package com.meza.lozano.jorge.patterns.modular.facade.compraOnline

class CompraFacade {
  private val inventario = new Inventario()
  private val pagos = new Pagos()
  private val envio = new Envio()

  def comprarProducto(producto: String, precio: Double): Unit = {
    println("🛒 Iniciando proceso de compra...")
    if (inventario.verificarProducto(producto) && pagos.procesarPago(precio)) {
      envio.enviarProducto(producto)
      println("✅ Compra completada con éxito!")
    } else {
      println("❌ Error en la compra.")
    }
  }
}
