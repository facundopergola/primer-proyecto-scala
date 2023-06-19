package vehiculo

class Motocicleta(ruedas: Int, color: String, marca: String, peso: Int) {

  private val Ruedas: Int = ruedas
  private val Color: String = color
  private val Marca: String = marca
  private val Peso: Int = peso

  def getRuedas(): Int = {
    Ruedas
  }

  def getcolor(): String = {
    Color
  }

  def getMarca(): String = {
    Marca
  }

  def getPeso(): Int = {
    Peso
  }
}


