class computers{
    var brand=""
    var price=0
    var specs=""

}
fun main(args:Array<String>){
 //  create object
    val myobj=computers()
    myobj.brand="Hewlett pack"
    myobj.price=8000
    myobj.specs="core i7 512 ssd 16gb ram"
    println("my laptop is a ${myobj.brand} and it is${myobj.specs} and costs ksh${myobj.price}")
}