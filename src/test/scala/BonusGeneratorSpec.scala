import org.scalatest.{MustMatchers, WordSpec}

class BonusGeneratorSpec extends WordSpec with MustMatchers {

  "BonusGenerator" must {

    "when given 100 and true return £120" in {
      BonusGenerator.bonus(100, Bonus = true) mustEqual "£120"
    }

    "when given 100 and false return £100" in {
      BonusGenerator.bonus(100, Bonus = false) mustEqual "£100"
    }

    "when given 80 and false return £80" in {
      BonusGenerator.bonus(80, Bonus = false) mustEqual "£80"
    }

    "when given 99 and true return £118" in {
      BonusGenerator.bonus(99, Bonus = true) mustEqual "£118"
    }
  }
}
