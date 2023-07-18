@file:JvmName("FunctionsClass")

package com.myKotlin

import com.myjava.MyJavaFile

//name of class in java when converted into bytecode
//used for interoperability
//className.functionName

fun main(){
    funcOne()
    funcWithParameter("Mah Rukh")
    println(findAreaOne(5,4))
    findAreaTwo(5,4)
    add()
    println(max(5,4))
    var maxNum = maxTwo(4,50)
    println("volume is ${findVolume(1,2)}")
    println("volume is ${findVolume(1,2,15)}")

    //naming parameters
    println("volume is ${findVolume(breadth = 1, length = 2, height = 15)}")

    //extension function usage
    val s1 = "Hello"
    val s2 = "World"
    var s3 = "Hey"
    println("Extension Function: ${s3.add(s1,s2)}")

    //calling infix function
    val x =10
    val y = 15
    val greaterValue = x.greaterVal(y)
    val greaterValueTwo = x greaterVal y //add spaces when infix function used


}

fun funcOne(){
    println("This is Simple Function")
}

fun funcWithParameter(name: String){
    println(name)
}

fun findAreaOne(length: Int, breadth: Int): Int{
    //function with parameters and return value
    return length * breadth
}
fun findAreaTwo(length: Int, breadth: Int): Unit{
    //function with parameters and returns nothing
    println("area is ${length*breadth}")
}

fun add(){
    var a = 2
    var b = 4
    var sum = a + b
    println("sum is ${sum}")
}

//function as expression
fun max(a:Int, b: Int):Int = if(a>b) a else b
fun maxTwo(a:Int, b: Int):Int =
    if(a>b) {
        println("$a is greater")
        a //at the end of block value is returned
    } else {
        println("$b is greater")
        b
    }

//function with default parameter
@JvmOverloads //to pass default parameters in Java Class
fun findVolume(length: Int, breadth: Int, height: Int = 10): Int{
    return length*breadth*height
}

//extension function example
fun String.add(str1: String, str2: String): String{
    return this + str1 + str2
}

//infix function --> have only one parameter
infix fun Int.greaterVal(other:Int):Int{
    if (this>other){
        return this
    }
    else{
        return other
    }
}
