fun main(){
    var myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()

}
interface MyInterfaceListener{
    //cannot create instance of interface

    var name: String //abstract and open in nature
    abstract fun onTouch()
    fun onClick(){
        //public but also open not final
        println("Interface clicked")
    }
}

interface MySecondInterface {
    fun onTouch(){
        println("second interface touched")
    }
    fun onClick(){
        println("second interface clicked")
    }
}
class MyButton : MyInterfaceListener, MySecondInterface{
    override var name: String =""

    override fun onTouch() {
    }

    override fun onClick() {
        //super.onClick() gives error
        super<MyInterfaceListener>.onClick()
        super<MySecondInterface>.onClick()
    }

}