import org.scalatest.{MustMatchers, WordSpec}

class TimesTablesSpec extends WordSpec with MustMatchers {

  "TimesTables" must {

    "when given 1 * 5 return 5" in {
      TimesTables.multiplier(1) mustEqual List(5)
    }
  }

}
