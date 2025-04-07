package com.meza.lozano.jorge.patterns.objectOriented.builder.pizza

class PizzaBuilder {
  private var tamaño: String = "Mediana"
  private var queso: Boolean = false
  private var pepperoni: Boolean = false
  private var champiñones: Boolean = false

  def conTamaño(tamaño: String): PizzaBuilder = {
    this.tamaño = tamaño
    this
  }

  def conQueso(): PizzaBuilder = {
    this.queso = true
    this
  }

  def conPepperoni(): PizzaBuilder = {
    this.pepperoni = true
    this
  }

  def conChampiñones(): PizzaBuilder = {
    this.champiñones = true
    this
  }

  def construir(): Pizza = Pizza(tamaño, queso, pepperoni, champiñones)
}
