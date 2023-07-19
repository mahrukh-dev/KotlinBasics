fun main(){
    var user1 = UserDataClass("mah", 1)
    var user2 = UserDataClass("mah", 1)

    //only compares data
    if(user1==user2){
        println("Equal")
    }
    else {
        println("not equal")
    }

    println(user1.toString())
    var newUser = user1.copy()
    println(newUser)
    var newUser1 = user1.copy(name = "peter")
    println(newUser1)
}

data class UserDataClass(var name:String, var id:Int){

}