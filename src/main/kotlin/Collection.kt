fun main(){
    ArrayWork()



}

fun ArrayWork(){
    //Arrays

    var myArray = Array<Int>(5) {0} //mutable, fixed size
    //Index:    0   1   2   3   4
    //Element:  0   0   0   0   0
    myArray[0] = 32
    myArray[3] = 54
    println(myArray[3])

    for(element in myArray){
        print(element)
    }
    println()
    for (index in 0..myArray.size-1){
        print(myArray[index])
    }



}