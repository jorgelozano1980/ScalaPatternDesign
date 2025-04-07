package com.meza.lozano.jorge.patterns.objectOriented.singleton.registroLogs

object Logger {
  def log(mensaje: String): Unit = println(s"[LOG]: $mensaje")
}
