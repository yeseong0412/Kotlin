package org.example.variable
class VariableSample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var s: String? = null
            println("hello")
            var a = 1
            a=10
            println(s ?: 0)

        }
    }
}