package org.example

class CalculatorImpl {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val calculator = Calculator(1,2);
            calculator.add()
            calculator.minus()
            calculator.x()
            calculator.l()
        }
    }
}