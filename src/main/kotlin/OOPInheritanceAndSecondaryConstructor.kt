fun main(){
    var dog = DogTwo("black", "pub")
    var animal = AnimalTwo("white")

}
open class AnimalTwo {
    var color:String = ""
    constructor(color:String){
        this.color = color
        println("from animal: $color")
    }

}
class DogTwo: AnimalTwo {
    var breed: String = ""
    constructor(color: String, breed: String): super(color){
        this.breed = breed
        println("from dog: $color and $breed")
    }
}