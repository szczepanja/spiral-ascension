import scala.collection.mutable

sealed trait Direction

object Up extends Direction
object Right extends Direction
object Down extends Direction
object Left extends Direction

object SpiralMatrix extends App {

  def spiralMatrix(steps: Int): List[List[Int]] = {
    val step = 0
    val x = 0
    val y = 0
    val maxSteps = steps
    val direction: Direction = Right
    val spiral: mutable.Map[(Int, Int), Int] = mutable.Map()

  }

}