fun main(){

}

//public visible everywhere and is default
public fun one(){}
public class two(){}

//private only visible within the same file
private fun three(){}
private class four(){}

//internal is visible within the same module
internal fun five(){}
internal class six(){}

//protected cannot be used directly


class TestClass{
    fun testing(){
        var personOne = PersonOne()
        //println(personOne.b) b is protected so isnt visible in other class
        //personOne.c and personOne.d are visible
    }
}
open class PersonOne{
    private val a = 1
    protected val b = 2
    internal val c = 3
    public val d = 5
}

class Pakistani: PersonOne(){
    //a is not visible
    //b, c, d is visible

    fun test(){
        //println(a) -> gives error as it is private
        println(b)
        println(c)
        println(d)
    }
}

