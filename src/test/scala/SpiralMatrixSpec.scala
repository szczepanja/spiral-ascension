import org.scalatest._
import flatspec._
import matchers._

class SpiralMatrixSpec extends AnyFlatSpec with should.Matchers {

  import SpiralMatrix._

  "spiralMatrix" should "given the size, return a square matrix of numbers in spiral order" in {
    spiralMatrix(3) shouldBe List(List(1, 2, 3), List(8, 9, 4), List(7, 6, 5))
  }

}
