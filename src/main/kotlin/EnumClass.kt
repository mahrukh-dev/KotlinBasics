
enum class CreditCardType{
    SILVER, //ordinal = 0, name="silver"
    GOLD,  //ordinal=1
    PLATINUM //ordinal=2
}

interface ICardCashBack{
    fun getValue(): Float
}
enum class CreditCardTypeTwo(val color:String, val max:Int=10000): ICardCashBack{
    SILVER("gray",5000){
        override fun getValue(): Float {
            return 0.02f
        }
    }, //ordinal = 0, name="silver"
    GOLD("gold"){
        override fun getValue(): Float {
            return 0.03f
        }
    },  //ordinal=1
    PLATINUM("black"){
        override fun getValue(): Float {
            return 0.04f
        }
    } //ordinal=2
}

fun main(){
    var value:CreditCardType = CreditCardType.GOLD
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD.name)

    val myConstants = CreditCardType.values()
    myConstants.forEach { println(it) }

    when(value){
        CreditCardType.SILVER -> println("silver card")
        CreditCardType.GOLD -> println("gold card")
        CreditCardType.PLATINUM -> println("platinum card")
    }


    println(CreditCardTypeTwo.SILVER.color) //grey

}