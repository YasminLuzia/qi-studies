package thiago.araujo.provan1.model

class Calculator(var value1: Double, var value2: Double) {

    fun addValues() : Double = this.value1 + this.value2
    fun subtractValues() : Double = this.value1 - this.value2
    fun multiplyValues() : Double = this.value1 * this.value2
    fun divideValues() : Double = this.value1 / this.value2
}