package objetos

class Animal(patas: Int, pelo: String) {

  private val cantidadPatas: Int = patas
  private  val colorDePelo: String = pelo

   def getCantidadPatas(): Int = {
     cantidadPatas
  }

   def getcolorDePelo(): String = {
    colorDePelo
  }
}



