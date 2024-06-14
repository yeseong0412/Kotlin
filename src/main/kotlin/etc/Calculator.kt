package etc

class Calculator (var a:Int , var b:Int){
    fun add() = println("답은 ${a+b}입니다. ")
    fun minus() = println("답은 ${a-b}입니다. ")
    fun x() = println("답은 ${a*b}입니다. ")
    fun l() {
        if (b==0) println("계산할 수 없습니다.")
        else println("답은 ${a / b}입니다. ")
    }


}