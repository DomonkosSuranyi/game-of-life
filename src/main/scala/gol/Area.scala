package gol

class Area (val cells: Array[Array[Cell]]) {
        
}

object Area {
    def apply(percent: Int, size: Int) = {
        new Area(generateRandom2DArray(size, percent));
    }

    private def generateRandom2DArray(size: Int, percent: Int) = {
        Array.fill(2)(Array.fill(size)(Cell.randomCell(percent)));
    }
}

