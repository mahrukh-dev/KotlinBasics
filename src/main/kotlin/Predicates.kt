fun main(){
    /*
    * PREDICATES
    * all - do all elements satisfy?
    * any - do any element satisfy?
    * count - total elements satisfy?
    * find - return first element that satisfy?
    * */

    val myNumbers = listOf(2,3,4,6,23,90)

    //are all elements greater than 10?
    val checkOne= myNumbers.all { it>10 }
    println("check one = $checkOne")

    //are any elements greater than 10?
    val checkTwo= myNumbers.any { it>10 }
    println("check two = $checkTwo")

    //Number of elements that are greater than 10
    val checkThree= myNumbers.count { it>10 }
    println("check three = $checkThree")

    //return first num that is greater than 10 and null if no value wasnt found
    val checkFour= myNumbers.find { it>10 }
    println("check three = $checkFour")





}