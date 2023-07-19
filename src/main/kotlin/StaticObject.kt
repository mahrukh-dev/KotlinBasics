fun main(){
    //call without creating instance
    Employee.id = 210910
    Employee.registerEmp()
    Employee.myMethod("Mah Rukh")
}

open class MySuperClass {
    open fun myMethod(str: String){
        println("My SUperCLass")
    }
}
object Employee: MySuperClass(){
    var id: Int = -1
    fun registerEmp(){
        println("employee has been registered")
    }

    init {
        //
    }

    override fun myMethod(str: String) { //act as static method
        super.myMethod(str)
        println("object Emp: $str")
    }
}

