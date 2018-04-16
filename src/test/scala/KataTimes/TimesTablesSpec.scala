package KataTimes

import org.scalatest.{MustMatchers, WordSpec}

class TimesTablesSpec extends WordSpec with MustMatchers {

  "TimesTables" must {

    "when given 1 * 5 return 5" in {
      TimesTables.multiplier(5).contains("1 * 5 = 5") mustEqual true
    }

    "when given 1 * 2 return 2" in {
      TimesTables.multiplier(2).contains("1 * 2 = 2") mustEqual true
    }

    "when given 1 * 7 return 7" in {
      TimesTables.multiplier(7).contains("1 * 7 = 7") mustEqual true
    }

    "when given 5 return 2 * 5 =  10" in {
      TimesTables.multiplier(5).contains("2 * 5 = 10") mustEqual true
    }

  }

}
