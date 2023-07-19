fun main(){
    MyClass.id =5
    MyClass.registerEmp()
}

class MyClass{
    companion object{
        var id: Int = -1

        @JvmStatic //to call in javafile
        fun registerEmp() {
            println("employee has been registered")
        }

    }


}