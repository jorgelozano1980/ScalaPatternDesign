package com.meza.lozano.jorge.patterns.objectOriented.state.maquinaExpendedora

object MaquinaApp extends App {
  val maquina = new MaquinaExpendedora

  maquina.seleccionarProducto() // ⚠️ No se puede sin dinero
  maquina.insertarDinero() // 💰 Dinero insertado
  maquina.insertarDinero() // ⚠️ Ya hay dinero
  maquina.seleccionarProducto() // ✅ Producto seleccionado
  maquina.entregarProducto() // 🎁 Producto entregado
  maquina.entregarProducto() // ⚠️ No hay dinero
}
