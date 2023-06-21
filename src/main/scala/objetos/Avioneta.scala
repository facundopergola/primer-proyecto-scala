package objetos

{
  case class Avioneta(alas : Int, name: String, modelo: String, asientos: Int )
    extends Vehiculo(name, modelo, asientos ) {

    private val Asientos: Int = asientos

    def getAsientos(): String = {
      val mensaje: String = s"${Asientos} son los asientos totales"
      mensaje
    }




  }




}


