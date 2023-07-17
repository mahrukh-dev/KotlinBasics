fun main(){
    ForLoopExamples()
    WhileLoopExamples()
    DoWhileLoopExamples()

}

fun ForLoopExamples(){
    for(i in 1..4){
        println("For Loop One")
    }
}

fun WhileLoopExamples(){
    var i = 0
    while(i<5){
        println("While Loop One")
        i++
    }
}

fun DoWhileLoopExamples(){
    var i = 0
    do {
        println("Do While Loop One")
        i++
    } while(i<5)

}