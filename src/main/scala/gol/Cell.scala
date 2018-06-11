package gol

import scala.util.Random

sealed abstract class Cell;

object Cell {
  case object LIVING extends Cell;
  case object DEAD   extends Cell;

  def randomCell(probabOfLiving: Int) : Cell = {
    if (probabOfLiving > 100 || probabOfLiving < 1)
      throw new IllegalArgumentException("Invalid value as percent (" + probabOfLiving + "%)");
    if (Random.nextInt(100) >= probabOfLiving) { DEAD } else { LIVING }
  }
}


