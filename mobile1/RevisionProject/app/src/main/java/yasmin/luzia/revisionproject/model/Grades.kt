package yasmin.luzia.revisionproject.model

class Grades(var grade1: Double, var grade2: Double) {

    fun averageGrade(): Double {
        return  (grade1 + grade2) / 2
    }

    fun result(): String{
        return if (averageGrade() >= 6) {
            "Approved"
        } else {
            "Reproved"
        }
    }
}