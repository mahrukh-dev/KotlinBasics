fun main(){
    IfStatementOne()
    IfStatementTwo()
    WhenStatementOne()
    WhenStatementTwo()
}

fun IfStatementOne(){
    //IF STATEMENT
    val a = 2
    val b = 5
    var maxValue: Int

    if (a>b){
        maxValue = a
    }
    else {
        maxValue = b
    }

    println("max value is ${maxValue}")
}

fun IfStatementTwo(){
    //IF AS AN EXPRESSION
    val a = 2
    val b = 5
    var maxValue: Int = if (a>b){
                            println("a is greater")
                            a
                        }
                        else {
                            println("b is greater")
                            b
                        }


    println("max value is ${maxValue}")
}

fun WhenStatementOne(){
    //WHEN STATEMENT
    val x = 2
    when(x) {
        0, 1 -> println("x is 0 or 1")
        2 -> println("x is 2")
        in 3..20 -> {
            println("in range 3....20")
        }
        !in 5..8 -> {
            println("not in range 5....8")
        }
        else -> {
            // else statement isnt neccessary
            println("x is unknown")
        }
    }
}

fun WhenStatementTwo(){
    //WHEN AS EXPRESSION
    val x = 2
    var str: String = when(x) {
        0, 1 -> "x is 0 or 1"
        2 -> "x is 2"
        in 3..20 -> "in range 3....20"
        !in 5..8 -> "not in range 5....8"
        else -> {
            // else statement isnt neccessary
            "x is alien" //unused
            "x is unknown" //returned and assigned
        }
    }
}