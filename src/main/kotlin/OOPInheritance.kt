
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
    var color: String = ""

    fun eat(){
        println("Eat")
    }
}

class Dog : Animal() {

    var breed: String = ""

    fun bark(){
        println("Bark")
    }

}

class Cat : Animal(){
    var age: Int = -1

    fun meow(){
        println("Meow")
    }

}