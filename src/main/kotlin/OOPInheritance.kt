
fun main(){

    var dog = Dog()
    dog.color = "black"
    dog.breed = "labra"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 2
    cat.color = "White"
    cat.eat()
    cat.meow()

    var animal = Animal()
    animal.color = "White"
    animal.eat()
}

open class Animal{
    open var color: String = "White"

    open fun eat(){
        println("Eat")
    }
}

class Dog : Animal() {

    var breed: String = ""
    override var color: String = "black"

    fun bark(){
        println("Bark")
    }

    //override
    override fun eat(){
        super<Animal>.eat()
        println("The dog is eating")
    }

}

class Cat : Animal(){
    var age: Int = -1

    fun meow(){
        println("Meow")
    }

    //override
    override fun eat(){
        println("The cat is eating")
    }

}