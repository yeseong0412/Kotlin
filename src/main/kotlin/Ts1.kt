package org.example

class Ts1 {
    companion object{
        @JvmStatic
        fun printProblemCounts(responses: Collection<String>) {
            var clientErrors = 0
            var serverErrors = 0
            responses.forEach {
                if (it.startsWith("4")) {
                    clientErrors++
                } else if (it.startsWith("5")) {
                    serverErrors++
                }
            }
            println("$clientErrors client errors, $serverErrors server errors")
        }

    }

}