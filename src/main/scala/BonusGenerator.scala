object BonusGenerator {

  def bonus(Salary : Int, Bonus : Boolean) : String = {
    if (Bonus) {
      s"${(Salary * 1.2).toInt}"
    } else {
      s"$Salary"
    }
  }

}
