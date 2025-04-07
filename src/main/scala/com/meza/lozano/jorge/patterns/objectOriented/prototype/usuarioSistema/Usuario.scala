package com.meza.lozano.jorge.patterns.objectOriented.prototype.usuarioSistema

case class Usuario(nombre: String, edad: Int, email: String) {
  def clonar(cambioNombre: Option[String] = None, cambioEdad: Option[Int] = None): Usuario = {
    Usuario(
      cambioNombre.getOrElse(this.nombre),
      cambioEdad.getOrElse(this.edad),
      this.email
    )
  }
}
