/*SCOPE FUNCTIONS - clear, concise, readable
* let - return: lambda result & context object: it
* run - return: lambda result & context object: this
* with - return: lambda result & context object: this
* also - return: context object & context object: it
* apply - return: context object & context object: this
* */

fun main(){
    val p = P4()
    p.name = "mah"
    p.age = 20

    //WITH KEYWORD
    //operate on non null object
    val p3 = P4()
    val ageAfterFiveYears= with(p3){
        println(this.name)
        println(age)
        name = "Arsh"
        age = 10
        age+5
    }


    //APPLY KEYWORD
    val p2 = P4().apply {
        name = "mah"
        age = 20
    }

    //ALSO KEYWORD
    //additional function after initializing
    val duplicatePerson= p2.also {
        it.name = "new name in also"
        println(it.name)
    }

    val numList: MutableList<Int> = mutableListOf(1,2,3)
    val dublicate= numList.also {
        println("the list elements are $it")
        it.add(4)
        println("the list elements after adding $it")
        it.remove(2)
        println("the list elements after removing $it")
    }

    //LET FUNCTION
    //mostly used to avoid NullPointerException
    //use on nullable object
    val name: String? = "hello"

    val strLen= name?.let{
        println(it.reversed())
        println(it.capitalize())
        println(it.length)
        it.length
    }

    //RUN FUNCTION
    //combination of with and let
    //use on nullable object
    val bio = p2?.run {
       println(name)
       println(age)
       age+5
       "he is a freak"
    }




}

class P4 {
    var name:String? = "mah rukh"
    var age:Int = 5
}