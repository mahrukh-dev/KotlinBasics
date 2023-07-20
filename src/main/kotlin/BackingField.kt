fun main(){}

class Human{
    var age =  20
        //backing field is only used within getter and setter
        //backing field is not generated unless required
        get() {
            //field for custom getter/setter
            println("Age is $field")
            return field
        }
        set(value){
            if(value>=0){
                field = value
            }
        }

    var name: String = "" //no backing field generated

    val isOld: Boolean //no backing field generated
        get() = age>=50
}