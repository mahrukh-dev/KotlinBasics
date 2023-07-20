fun main(){
    ArrayWork()
    ImmutableListWork()
    MutableListWork()
    ImmutableMapWork()
    MutableMapWork()
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

fun ImmutableMapWork(){
    //read only
    //key-val pairs
    //immutable, fixed size

    var myMap = mapOf<Int, String>( 10 to "m1", 3 to "m2", 4 to "m3")

    for(key in myMap.keys){
        println(myMap[key]) //myMap.get(key)
        println("element at key: $key = ${myMap.get(key)}")
    }
}

fun MutableMapWork(){
    //key-val pairs
    //mutable

    var myMap = HashMap<Int, String>()
    var myMap1 = mutableMapOf<Int, String>()
    var myMap2 = hashMapOf<Int, String>()

    myMap.put(4, "h1")
    myMap.put(10, "h2")
    myMap.put(7, "h3")

    //same functionality of both in this scenario
    myMap.replace(4, "h5")
    myMap.put(4, "h5")

    for(key in myMap.keys){
        println("element at key: $key = ${myMap.get(key)}")
    }
}