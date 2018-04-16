import org.scalatest.{MustMatchers, WordSpec}

class BonusGeneratorSpec extends WordSpec with MustMatchers {

  "BonusGenerator" must {

    "when given 100 and true return 120" in {
      BonusGenerator.bonus(100, true) mustEqual "120"
    }

    "when given 100 and false return 100" in {
      BonusGenerator.bonus(100, false) mustEqual "100"
    }


  }

}
