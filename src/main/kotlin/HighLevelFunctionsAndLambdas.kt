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
    val myLambda: (Int, Int) -> Int = { x:Int, y: Int -> x+y }
    program.addTwoNums(2,7,myLambda)
    program.addTwoNums(2,7, { x , y -> x + y })

    program.addTwoNums(2,4){x,y -> x+y}

}

class Program{

    fun addTwoNums(a:Int, b:Int, action: (Int, Int) -> Int ){
        val sum = action(a,b)
        println(sum)
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