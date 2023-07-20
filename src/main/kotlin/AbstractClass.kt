fun main(){
}

//can create object of abstract class
abstract class PersonTwo{

    abstract  var name: String //never instantiate
    abstract fun eat() //abstract doesnt have a body and is by default open
    open fun getHeight(){} //overriding is optional in case of open
    fun goToSchool(){}
}

class Pak: PersonTwo(){

    override var name: String = "dummy_pak_name"
    override fun eat() {}
    //should override all abstract methods in subclass
}