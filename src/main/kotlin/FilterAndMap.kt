fun main(){
    //FILTER
    /*
    * returns a list containing only elements matching
    * */

    //MAP
    /*
    * returns a list containing the results of applying
    * the given transform function to each element
    * */

    val myNumbers: List<Int> = listOf(4, 5,6,23,90)

    val mySmallNum= myNumbers.filter { it<10 }
    for (num in mySmallNum){
        println(num)
    }

    val mySquaredNum = myNumbers.map { it * it }
    for (n in mySquaredNum){
        println(n)
    }

    val mySmallSquaredNum = myNumbers.filter { it<10 }.map { it*it }

    //list of a class type
    var people = listOf<P2>(P2(10, "Arsh"), P2(20, "Mah Rukh"))
    var names = people.map { it.name }
    var ANames = people.filter { it.name.startsWith("A") }.map { it.name }
    for (n in names){
        println(n)
    }
    for (a in ANames){
        println(a)
    }
}

class P2(var age:Int, var name:String){
    //class body
}

