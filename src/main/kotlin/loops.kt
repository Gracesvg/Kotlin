fun main(args:Array<String>) {
//      for loops
    for (i in 5..15){
        println("My loops:$i")
    }
    var myarr= arrayOf("Grace","John","lauren","Clare")
    for (names in myarr){
        println("Student: $names")
    }
//  do..while
    var num=100
    do {
        println("Loop: $num")
        num+=2
    }while (num<=110)
}