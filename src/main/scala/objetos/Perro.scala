package objetos

case class Perro(patas: Int, pelo: String, size: Int) extends Animal(patas, pelo) {

    private val _size: Int = size
   def getSize(): String = {
     val mensaje: String = s"${_size} MTS"
     mensaje
   }


}