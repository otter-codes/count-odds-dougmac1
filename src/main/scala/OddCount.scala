object OddCount {

  def count(list: Int) : Int = {
    val range = 0 until list
    val filteredList = range.count(x => x % 2 != 0)
    filteredList
  }
}


val X = 10
List.range(1,X,2).length
