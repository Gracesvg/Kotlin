class Wanafunzi(val jina:String,var miaka:Int, val gender:String) {

}
fun main(args:Array<String>){
    val mimi=Wanafunzi("Grace",20,"female")
    println("Stud name is: ${mimi.jina} and age is ${mimi.miaka} and gender is ${mimi.gender}")
    val mimi1=Wanafunzi("John",20,"male")
    println("Stud name is: ${mimi1.jina} and age is ${mimi1.miaka}and gender is${mimi1.gender}")
    val mimi2=Wanafunzi("Grace",20,"male")
    println("Stud name is: ${mimi2.jina} and age is ${mimi2.miaka} and gender is ${mimi2.gender}")
}