fun main(){
    val program = Program()
    program.addTwoNums(2,7)
    program.addTwoNums(2,7, object: MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }

    })


    val test : String = "hello"
    //lambda expression [Function]
    val myLambda: (Int) -> Unit = { s: Int -> println(s) }
    program.addTwoNums(2,7,myLambda)

}

class Program{

    fun addTwoNums(a:Int, b:Int, action: (Int) -> Unit ){
        val sum = a+b
        action(sum)
    }
    fun addTwoNums(a:Int, b:Int, action: MyInterface){
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNums(a:Int, b:Int){
        val sum = a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum:Int)

}