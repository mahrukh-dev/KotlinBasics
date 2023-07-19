fun main(){
    ArrayWork()
    ImmutableListWork()
    MutableListWork()
}

fun ArrayWork(){
    //Arrays - mutable, fixed size

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

fun ImmutableListWork(){
    //lists
    //immutable, fixed size, read only
    var list = listOf<String>("n1", "n2", "n3")
    println( list.get(0))
}

fun MutableListWork(){
    //Mutable List - mutable, no fixed size, add/remove

    var mList = mutableListOf<String>()
    var mList2 = arrayListOf<String>()
    var mList3 = ArrayList<String>()

    mList.add("l1")
    mList.add("l2")
    mList.add("l3")

    mList.remove("l2")
    mList.add("List2")

    mList[2] = "List 3"

    for(element in mList){
        print(element)
    }
    println()
    for (index in 0..mList.size-1){
        print(mList[index])
    }
}