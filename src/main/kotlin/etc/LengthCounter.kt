package etc

class LengthCounter {
    var counter: Int = 0
        private set



    fun addWord(word: String) {
        counter += word.length
    }
    fun retun ():Any{
        return counter
    }
}

class LengthTest{
    companion object {
        val ls: LengthCounter = LengthCounter()
        @JvmStatic
        fun main(args: Array<String>) {
            test()
            println(ls.retun())

        }
        fun test() {
            ls.addWord("test")
        }
    }
}
