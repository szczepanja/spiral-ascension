import org.scalatest._
import flatspec._
import matchers._

class SpiralMatrixSpec extends AnyFlatSpec with should.Matchers {

  import SpiralMatrix._

  "nextDirection" should "show next direction" in {
    nextDirection(Up) shouldBe (Right)
    nextDirection(Right) shouldBe (Down)
    nextDirection(Down) shouldBe (Left)
    nextDirection(Left) shouldBe (Up)
  }

}
