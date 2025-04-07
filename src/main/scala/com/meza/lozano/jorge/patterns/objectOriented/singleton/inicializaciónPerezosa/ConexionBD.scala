package com.meza.lozano.jorge.patterns.objectOriented.singleton.inicializaciónPerezosa

object ConexionBD {
  lazy val instancia: ConexionBD = new ConexionBD()

  def obtenerConexion(): ConexionBD = {
    println("Obteniendo la conexión...")
    instancia
  }
}

class ConexionBD private() {
  println("🔗 Conexión a la base de datos establecida.")
  def ejecutarConsulta(consulta: String): Unit = println(s"Ejecutando consulta: $consulta")
}
