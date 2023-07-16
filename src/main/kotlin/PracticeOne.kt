const val STRING_CONST = "Mah Rukh - Summer Intern - Stella Technology"

fun PracticeOne() {

    var userName: String = "Mah Rukh"
    userName = "Arsh"
    //userName = 2

    val age: Int = 10
    // cannot be changed since the value is const
    //age = age + 10


    println("Hello \$userName! with age $age. In two years, he will be ${age + 2}.  ")
    print("print without ln")
    sayHello()

    //more about vals
    val exampleString = "\"one\ntwo\""
    println(exampleString)
    val exampleNum = 2_000_000.12
    val exampleLong: Long = exampleNum.toLong()

    val exampleChar = '?'
    val exampleInt: Int = exampleChar.toInt()
    val exampleBoolean = false

    //PART SIX

    var a = 5
    val b = 3.0

    println("a = " + a + " b = " + b )

    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    println("2 + 2 * 3 = ${2 + 2 * 3}")

    a = a + 2

    a += 2
    println("a += 2 => $a")

    println("a++ = ${a++}")
    println("++a = ${++a}")
    println("-a => ${-a}")

    a -= 2
    println("a -= 2 => $a")

    a *= 2
    println("a *= 2 => $a")

    a /= 2
    println("a /= 2 => $a")

    //PART SEVEN
    //tools --> Kotlin --> KotlinRepel for testing

    //PART EIGHT
    //one line comment
    /**
     * multiple line comment
     */

    //PART NINE
    val names = arrayOf("Jim", "John", "Jenny")
    val a2 = arrayOf(1, "hello", '?')
    val a3 = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9),
    )

    names[0] = "Jermiah"
    println("first element: ${names[0]}")
    println("first element letter 3: ${names[0][2]}")
    println("first element length: ${names[0].length}")

    println("num of elements: ${names.size}")
    println("last element: ${names.last()}")
    println(a3[1][1])


    //PART TEN

    for (i in names.indices){
        println("Index: ${i}, Element ${names[i]}")
    }

    val stringOne = "Hello"
    for (c in stringOne){
        println(c)
    }

    for (i in 1..10) {
        print(i)
    }
    println()
    for (i in 1 until 10) {
        print(i)
    }
    println()
    for (i in 10 downTo 1) {
        print(i)
    }
    println()
    for (i in 1..10 step 2) {
        print(i)
    }
    println()
    for (i in 1.rangeTo(10).step(2)) {
        print(i)
    }
    println()


    //PART ELEVEN

    val b1 = false
    println("2>1 is ${2 > 1}")
    println("!(2>1) is ${!(2 > 1)}")
    println("2<1 is ${2 < 1}")
    println("1>=1 is ${1 >= 1}")
    println("1==1 is ${1 == 1}")
    println("1==2 is ${1 == 2}")
    println("1!=2 is ${1 != 2}")

    println("true && false = ${true && false}")
    println("true || false = ${true || false}")

    val condition = (2>1)||(3>2)&&(2>3)
    println(condition)

    //PART TWELVE

    var k = 0
    while(k<5){
        print(k)
        //continue
        //continues to next inclosing loop , moves to check loop then reruns the loop accordingly
        k++
        //break
        //break used to exit from the loop
    }

    println()

    var l = 0
    outer@ do {
        //outer is the label for the loop
        print(l)
        l++
        //break@outer
    } while(l<5)

    println()
    //PART THIRTEEN
    //PART FOURTEEN

    val time = 12

    when (time){
        in 0..11 -> println("morning")
        12 -> println("afternoon")
        13, 14 -> println("nap")
        else -> println("day")
    }

    //PART FIFTEEN
    var name = "Hasham"
    greeting(name)

    //PART SIXTEEN
    val max = getMaxVal(12, 2)
    println("max = ${max}")

    //PART SEVENTEEN
    println("double = ${double(4)}")

    //PART EIGHTEEN
    //function overloading
    println( getMax(4, 3))
    println( getMax(4.5, 3.2))

    //PART TWENTY
    println(getSum(3,4))
    println(getSum(3,4, 5))
    println(getSum(3,4, 5, 6))
    val nArray = intArrayOf(1,2,3,4,10,100)
    println( getSum2(1,5,6,4,4))

    //passing array as argument
    println(getSum2(*nArray))

    //PART TWENTY_TWO
    val user = User("  Mah     ", 20) //instantiation
    println("username: ${user.name}")
    println("userage: ${user.age}")

    user.age = 30

}

fun sayHello(): Unit{
    println("Hello, Stella Tech")
}

//PART FIFTEEN
fun greeting(name: String){
    println("Hello $name, nice to meet you")
}

fun getMaxVal(num1: Int, num2: Int): Int {
    val max = if (num1>num2) num1 else num2
    return max
}

fun double(number: Int): Int = number * 2


fun getMax(a: Int, b: Int): Int = if (a>b) a else b
fun getMax(a: Double, b: Double): Double = if (a>b) a else b

fun getSum(a: Int, b: Int, c: Int = 0, d: Int = 0): Int{
    var sum = a + b + c + d
    return sum
}

fun getSum2(vararg numbers: Int):Int {
    var sum = 0
    //numbers -- IntArray
    for(i in numbers){
        sum = sum + i
    }
    return sum
}

class User(var name: String = "No Name", age: Int) {
    var age = age //can change

    init{
        if (name.isBlank()){
            name = "No Name"
        }
        else {
            name = name.trim()
        }
    }
}