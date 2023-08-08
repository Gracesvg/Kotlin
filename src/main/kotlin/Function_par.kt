fun getfullname(firstname:String,lastname:String=""):String{

    return if(lastname.isNotEmpty()){
        "$firstname $lastname"
    }else{
        firstname
    }
}
fun score(correctanswer:Int,totalquestions:Int):Int{
    return (correctanswer*100)/totalquestions

}
fun main(args:Array<String>){
//    lambda function
    val sum={num1:Int,num2:Int ->num1+num2}
    println("20+7:${sum(20,7)}")

    val stud1=getfullname("Grace","Gloria")
    println(stud1)

    val correctanswer=13
    val totalquestions=35
    val score=score(correctanswer,totalquestions)
    println("Your score is:$score %")
}

