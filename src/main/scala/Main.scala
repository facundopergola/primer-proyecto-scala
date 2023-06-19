import vehiculo.Motocicleta

object Main {
  def main(args: Array[String]): Unit = {

    val motocicleta = new Motocicleta(ruedas = 2, color = "negro", marca = "honda", peso = 240)

    println(motocicleta.getPeso())
    println(motocicleta.getcolor())
    println(motocicleta.getMarca())
    println(motocicleta.getRuedas())
  }
}
