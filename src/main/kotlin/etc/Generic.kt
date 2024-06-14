package etc

fun main() {

}

open class Generic() {
    open fun shout(){
        println("A가 소리칩니다.")
    }
}

class B : Generic(){
    override fun shout() {
        println("Generic 이 소리칩니다.")
    }
}

class c: Generic(){
    override fun shout() {
        println("C가 소리칩니다.")
    }
}

class UsingGeneric<T: Generic>(val t: T){

}


data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}