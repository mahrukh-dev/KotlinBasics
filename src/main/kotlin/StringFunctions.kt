import com.classes.Rectangle

fun main(){
    StringFuncs()
}

fun StringFuncs(){

    val name = "Name One"
    val str = "Hello ${name}"
    println("The statement ${str} has ${str.length}.")

    val a = 10
    val b = 5
    println("sum of ${a} and ${b} is ${a + b}")

    var rect = Rectangle()
    rect.length = 5
    rect.breadth = 2
    println("The length of rectangle is ${rect.length} and breadth is ${rect.breadth}.")
    println("Area of rectangle is ${rect.length * rect.breadth}")

}