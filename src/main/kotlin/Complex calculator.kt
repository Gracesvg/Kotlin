//Create a function that displays a complex calculator using input-output
fun main() {
    println("Complex calculator")
    println("Enter the first complex number")
    val  num1= readln()!!.toDouble()
    println("Enter the second complex number")
    val  num2= readln()!!.toDouble()

    
    val sum=num1+num2
    val subtraction=num1-num2
    val multiplication=num1*num2
    val division=num1/num2

    println("Sum: $sum")
    println("subtraction: $subtraction")
    println("multiplication: $multiplication")
    println("division: $division")
}

