import scala.collection.mutable

sealed trait Direction

object Up extends Direction

object Right extends Direction

object Down extends Direction

object Left extends Direction

object SpiralMatrix extends App {

  def nextDirection(direction: Direction): Direction = direction match {
    case Up => Right
    case Right => Down
    case Down => Left
    case Left => Up
  }

  def spiralMatrix(steps: Int): List[List[Int]] = {
    var step = 0
    var x = 0
    var y = 0
    var maxSteps = steps
    var direction: Direction = Right
    var spiral: mutable.Map[(Int, Int), Int] = mutable.Map()

    for (i <- 1 to (steps * steps)) {
      step += 1
      if (step >= maxSteps) {
        direction = nextDirection(direction)
        if (direction == Up || direction == Down) {
          maxSteps -= 1
        }
        step = 0
      }
    }
  }

}
