package gol

class Area (val cells: Array[Array[Cell]]) {
    private def getCellWithNeighbours(coord: (Int, Int)) = {
        var retArray = Array.ofDim[Cell](3, 3);
        for (x <- -1 to 1) {
            for (y <- -1 to 1) {
                val newCoord = (coord._1+x, coord._2+y);
                retArray(x+1)(y+1) = newCoord match {
                    case (-1, _) => Cell.DEAD
                    case (_, -1) => Cell.DEAD
                    case (size, _) => Cell.DEAD
                    case (_, size) => Cell.DEAD
                    case _ => cells(newCoord._1)(newCoord._2)
                }
            }
        }
        retArray
    }

    def size: Int = cells.size;
}

object Area {
    def apply(percent: Int, size: Int) = {
        new Area(generateRandom2DArray(size, percent));
    }

    private def generateRandom2DArray(size: Int, percent: Int) = {
        Array.fill(2)(Array.fill(size)(Cell.randomCell(percent)));
    }
}

