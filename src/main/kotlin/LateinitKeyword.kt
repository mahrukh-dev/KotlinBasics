fun main(){
    val cnt = Country()
    cnt.name = "pakistan"
    println(cnt.name)
    cnt.setup()
}

class Country{
    lateinit var name: String //will initialize sometime later
    //lateinit can only be used with mutable data type
    //used only with nonnullable
    //must be initialized before using it
    //else UninitializedPropertyAccessException
    fun setup(){
        name = "USA"
        println("the name of country is $name")
    }
}
