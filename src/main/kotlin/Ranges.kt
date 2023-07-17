fun main(){
    ranges()
}

fun ranges(){
    //Ranges using double dot

    val r1 = 1..5
    //1,2,3,4,5

    val r2 = 5 downTo 1
    //5,4,3,2,1

    val r3 = 5 downTo 1 step 2
    //5,3,1

    val r4 = 1..5 step 2
    //1,3,5

    val r5 = "a".."z"
    //a,b,c,..., z

    val r6 = 'a'..'z'
    //a,b,c,...,z

    var isPresent = 'c' in r6

    var countDown = 10.downTo(1)
    //10,9,8,...,1

    var moveUp = 1.rangeTo(10)
    //1,2,3,...,10


}