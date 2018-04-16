import org.scalatest._

class ReversedSpec extends WordSpec with MustMatchers {

  "Reversed" must {

    "when given the number 2 return 1" in {
      Reversed.count(2) mustEqual 1
    }

    "when given the number 5 return 2" in {
      Reversed.count(5) mustEqual 5
    }

  }

}
