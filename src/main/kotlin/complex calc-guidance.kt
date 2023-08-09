fun complexcal(){
    println("Complex calculator")
    print("Enter the first number")
    val num1= readln()?.toDoubleOrNull()
    print("Enter the operator(+*/-)")
    val operator= readLine()
    print("Enter the first number")
    val num2= readln()?.toDoubleOrNull()
    if(num1==null||operator==null||num2==null){
        println("invalid input")
        return
    }
    val result=when(operator){
        "+"->num2+num2
        "-"->num2-num2
        "*"->num2*num2
        "/"->if (num2!=0.0)num2/num2 else "you cant divide by 0"
        else->("Invalid operator")
    }
    println("Answer is $result")

}
fun main(args:Array<String>) {
    complexcal()
}