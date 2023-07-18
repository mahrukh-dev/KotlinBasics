package com.classes

//extension Function
fun Student.isScholar(marks:Int):Boolean{
    return marks>95
}
class Student {
    fun hasPassed(marks:Int):Boolean{
        return marks>40
    }
}