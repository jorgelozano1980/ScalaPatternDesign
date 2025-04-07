package com.meza.lozano.jorge.patterns.objectOriented.builder.usuario

class UsuarioBuilder {
  private var nombre: String = ""
  private var edad: Option[Int] = None
  private var email: Option[String] = None
  private var direccion: Option[String] = None

  def conNombre(nombre: String): UsuarioBuilder = {
    this.nombre = nombre
    this
  }

  def conEdad(edad: Int): UsuarioBuilder = {
    this.edad = Some(edad)
    this
  }

  def conEmail(email: String): UsuarioBuilder = {
    this.email = Some(email)
    this
  }

  def conDireccion(direccion: String): UsuarioBuilder = {
    this.direccion = Some(direccion)
    this
  }

  def construir(): Usuario = Usuario(nombre, edad, email, direccion)
}
