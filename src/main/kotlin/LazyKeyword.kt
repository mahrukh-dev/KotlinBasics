val pi: Float = 3.14f //waste of memory
val pie: Float by lazy { 3.14f }
//no memory is allocated unless you use it
//can be nullable and non nullable
//can be val/var

fun main(){

    println("some initial code...")

    val area = pie * 4 * 4
    //effective use for memory initialization
    //now initialized so it is stored in cache mem

    val a2= pie * 5*5
    //now accessed from cache memory


    println("some more code...")
}