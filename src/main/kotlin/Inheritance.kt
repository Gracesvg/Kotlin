open class Animal(val name:String){
    open fun makesound(){
        println("$name make a sound")
    }
}
class cat(name: String):Animal(name){
    override fun makesound(){
        println("$name meows")
    }
}
class Dog(name: String):Animal(name){
    override fun makesound(){
        println("$name barks")
    }
}
class pig(name: String):Animal(name){
    override fun makesound() {
        println("$name snorts")
    }
}
class cow(name: String):Animal(name){
    override fun makesound() {
        println("$name moo's")
    }
}
fun main(args:Array<String>) {
    val dog=Dog("spoty")
    val cat=cat("mittens")
    val pig=pig("buddy")
    val cow=cow("bull")
    dog.makesound()
    cat.makesound()
    pig.makesound()
    cow.makesound()
}