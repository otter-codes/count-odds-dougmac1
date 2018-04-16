import org.scalatest._

class OddCountSpec extends WordSpec with MustMatchers {

  "OddCount" ignore {

    "when given the number 2 return 1" in {
      OddCount.count(2) mustEqual 1
    }

    "when given the number 5 return 2" in {
      OddCount.count(5) mustEqual 2
    }

  }

}
