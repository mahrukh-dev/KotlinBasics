fun main(){
    var dog = DogOne("black", "pub")
    var animal = AnimalOne("white")

}
open class AnimalOne(var color:String){
    init{
        println("Animal")
    }
}
class DogOne(color:String, var breed:String) : AnimalOne(color) {
    init {
        println("dog")
    }
}