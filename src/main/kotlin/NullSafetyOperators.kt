fun main(){
    /* NULL SAFETY OPERATORS
    * ?. safecall operator
    * ?: elvis
    * !! not null assertion
    * ?.let{..} safe call with let
    */

    //val name: String = null --> gives error
    val name: String? = null

    //SAFECALL OPERATOR(?.)
    //return the length if 'name' is not null
    // else returns NULL
    println("length is ${name?.length}")


    //SAFECALL WITH LET (?.let)
    //executes block only if not null
    name?.let{
        println("length is ${name.length}")
    }

    //ELVIS OPERATOR (?:)
    //if null return the other value
    val len = if (name != null) name.length else -1
    val length = name?.length ?: -1
    println(length)

    //NOT NULL ASSERTION OPERATOR (!!)
    //use when you are sure that the value is not null
    //or else will give null pointer exception
    println("length is ${name!!.length}")


}