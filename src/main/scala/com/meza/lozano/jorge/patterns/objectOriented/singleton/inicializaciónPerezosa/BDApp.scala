package com.meza.lozano.jorge.patterns.objectOriented.singleton.inicializaciónPerezosa

object BDApp extends App {
  println("Aplicación iniciada")

  val conexion1 = ConexionBD.obtenerConexion()
  conexion1.ejecutarConsulta("SELECT * FROM usuarios")

  val conexion2 = ConexionBD.obtenerConexion()
  conexion2.ejecutarConsulta("SELECT * FROM productos")

  println("Aplicación finalizada")
}
