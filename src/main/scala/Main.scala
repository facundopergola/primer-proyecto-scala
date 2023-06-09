import objetos.Animal

object Main {
  def main(args: Array[String]): Unit = {

    val perro = new Animal(pelo = "Negro", patas = 4)


    println(perro.getCantidadPatas())
    println(perro.getcolorDePelo())

  }
}
