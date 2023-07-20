fun main(){
    val human = HumanOne()
    human.age=45
    println("age is ${human.age}")


}

//backing property for encapsulation and security
class HumanOne{
    private var _age:Int=0 //backing field hold actual property data
    var age:Int //backing property is exposed
        get() {return _age}
        set(value) {_age = value}
}

class Hobby{
    private val _hobbies = mutableListOf<String>()//backing field
    val hobbies: List<String>//backing property
        get() = _hobbies

    fun addHobby(hobbyName: String){
        _hobbies.add(hobbyName)
    }
}