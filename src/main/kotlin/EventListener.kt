package org.example

fun main(){
    EventPrinter().start()
}

class EventListener {
}

interface EventListener1{
    fun onEvent(counter: Int)
}

class Counter(var listener: EventListener1){
    fun count(){
        for (i in 1..100){
            if (i%5==0) listener.onEvent(i)
        }
    }
}

class EventPrinter: EventListener1{
    override fun onEvent(counter: Int) {
        print("$counter-")
    }
    fun start(){
        val counter = Counter(this)
        counter.count();
    }

}