package com.meza.lozano.jorge.patterns.objectOriented.composite.sistemaArchivos

object CompositeExample extends App {
  val archivo1 = new Archivo("documento.txt")
  val archivo2 = new Archivo("foto.jpg")

  val subCarpeta = new Carpeta("Mis Imágenes")
  subCarpeta.agregar(new Archivo("vacaciones.png"))
  subCarpeta.agregar(new Archivo("familia.jpg"))

  val carpetaRaiz = new Carpeta("Carpeta Principal")
  carpetaRaiz.agregar(archivo1)
  carpetaRaiz.agregar(archivo2)
  carpetaRaiz.agregar(subCarpeta)

  carpetaRaiz.mostrar()
}
