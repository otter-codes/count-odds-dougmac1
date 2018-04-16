package KataTimes

object TimesTables extends App {

  def multiplier(Integer: Int): List[Any] = {
    val oneToTen = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    oneToTen.map(x => s"$x * $Integer = ${x * Integer}")

  }
}
