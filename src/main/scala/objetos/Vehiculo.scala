package objetos

class Vehiculo(name: String, modelo: String, asientos: Int) {

  private val Name: String = name
  private val Modelo: String = modelo
  private val Asientos: Int = asientos

  def getName(): String = {
    Name
  }

  def getModelo(): String = {
    Modelo
  }

  def getAsientos(): Int = {
    Asientos
  }


}
