open class Mpesaaccount(val phoneno:String, var balance:Double){
    open fun deposit(amount: Double){
        if (amount>0){
          balance +=amount
            println("Deposited $amount into account $phoneno.New balance: $balance")
        }else{
            println("invalid deposit")
        }
    }
    open fun withdrawn(amount: Double){
        if (amount>0 && amount<=balance){
            println("Withdrawn $amount from account $phoneno.Balance:$balance")
        }else{
            println("Insufficient balance")
        }

    }
}
class checkbalance(phoneno: String,balance: Double):Mpesaaccount(phoneno, balance){
    fun  sendmoney(recieverphoneno:String,amount: Double){
        if (amount>0 && amount<=0){
            balance-=amount
            println("sent $amount to account $recieverphoneno. Balance:$balance")
        }else{
            println("insufficient balance")
        }
    }
}
fun main(args:Array<String>){
    val useraccount=checkbalance("0112001116",800.9)
    val recieveraccount=checkbalance("0727633457",1000.6)

    useraccount.deposit(560.9)
    useraccount.withdrawn(250.0)
    useraccount.sendmoney(recieveraccount.phoneno,50.2)
}