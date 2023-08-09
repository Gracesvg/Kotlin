class people(val name: String,val age:Int,val gender:String){
//  member fuction for intro
    fun jitambulishe(){
        println("Hi my name is $name im a $age year old $gender")
    }
//    member function to have a birthday
    fun  havebirthday(){
       // age++
    println("$name just turned $age")
    }

}
fun main(args:Array<String>){
    //create an instance(objects) of the class
    val watu=people("John",45,"male" )
    val watu1=people("Alice",21,"female")
    val watu2=people("Kyle",19,"male")

    watu.jitambulishe()
    watu1.jitambulishe()
    watu2.jitambulishe()
    watu.havebirthday()
    watu1.havebirthday()
    watu2.havebirthday()
}