object OddCount {

  def count(list: Int) : Int = {
    val range = 0 until list
    val filteredList = range.count(x => x % 2 != 0)
    filteredList
  }
}
