package etc

class Ramda1 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            b(Companion::a)
        }

        private fun a(str: String) {
            println("함수 a $str")
        }

        private fun b(function: (String) -> Unit) {
            function("b가 호출한 함수")
        }
    }

}
