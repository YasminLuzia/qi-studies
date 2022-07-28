package yasmin.luzia.revisionproject.model

class Square(var squareSide: Double) {

    fun calculateArea(): Double {
        return squareSide * squareSide
    }

    fun calculatePerimeter(): Double {
        return squareSide * 4
    }

}