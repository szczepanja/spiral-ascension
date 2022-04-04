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

}
