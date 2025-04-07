package com.meza.lozano.jorge.patterns.objectOriented.builder.usuario

case class Usuario(
    nombre: String,
    edad: Option[Int],
    email: Option[String],
    direccion: Option[String]
)
