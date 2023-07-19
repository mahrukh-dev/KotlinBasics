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

    //in case of closure, when unit is the return type, lambda functions can be used to modify outside parameters
    var result = 0
    program.addTwoNumsClosure(1,2){x,y->result=x+y}
    println(result)

    //it keyword if we have only one parameter
    program.reverseAndDisplay("hello", { it.reversed() })


}

class Program{

    fun reverseAndDisplay(str: String, myFunc: (String)->String){
        var result= myFunc(str)
        println(result)
    }
    fun addTwoNumsClosure(a:Int, b:Int, action: (Int, Int) -> Unit ){
        action(a,b)
    }
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