sealed class Shape{
    data class Circle(var radius:Float):Shape()
    class Square(var side: Int):Shape()
    object NotAShape: Shape()
    sealed class Line: Shape()
    sealed interface Draw

}
class Rect(var l: Int, var b :Int):Shape()

fun main(){
    var obj1 = Shape.Circle(3.0f)
    var obj2 = Shape.Square(8)
    var obj3 = Rect(4,5)
    var obj4 = Shape.NotAShape

    checkShape(obj1)
    checkShape(obj2)
    checkShape(obj3)
}

fun checkShape(shape: Shape){
    when(shape){
        is Shape.Circle -> println("CIRCLE")
        is Rect -> println("RECTANGLE")
        is Shape.Square -> println("SQUARE")
        Shape.NotAShape -> println("NOT A SHAPE")
        else -> println("ELSE CONDITION")
    }
}