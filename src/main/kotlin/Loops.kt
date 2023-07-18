fun main(){
    ForLoopExamples()
    WhileLoopExamples()
    DoWhileLoopExamples()
    /*
    * loop control statements :
    * break
    * continue
    * return
    * */

}

fun ForLoopExamples(){
    //counter loop
    for(i in 1..5){
        println("For Loop One")
    }

    for(i in 1..10){
        println("For Loop Two")
        if (i==5){
            break  //exit out of loop
        }
    }

    println("For Loop Three: Nested loop and break inner loop")
    for(j in 1..3){
        for (k in 1..3){
            println("$j $k")
            if (j==2 && k==2){
                break
            }
        }
    }

    println("For Loop Four: Nested loop and break outer loop")
    outer@ for(j in 1..3){
        for (k in 1..3){
            println("$j $k")
            if (j==2 && k==2){
                break@outer
            }
        }
    }

    println("For loop Five: Continue Statement")
    for(i in 1..5){
        if (i==5){
            continue //skips the code in this loop and continues with the next loop i.e skips 5 and continues with 6
        }
        print(" $i ")
    }

    println("For Loop Four: Nested loop and continue outer loop")
    outerLoop@ for(j in 1..3){
        for (k in 1..3){
            if (j==2 && k==2){
                continue@outerLoop
                //continues from j = 3
            }
            println("$j $k")
        }
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
    //always executed once
    var i = 0
    do {
        println("Do While Loop One")
        i++
    } while(i<5)

}