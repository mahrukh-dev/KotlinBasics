package com.classes

class Customer (var name: String) {

    var id: Int = -1
    init {
        //class initializer code
        println("Customer name is ${this.name}")
    }

    constructor(n: String, id: Int): this(n){
        //the body of secondary constructor is called after the init block
        this.id = id
    }
}