import java.util.*

val scan: Scanner = Scanner(System.`in`)

fun readInt(mensaje:String,intMin:Int,intMax:Int):Int{
    val scan=Scanner(System.`in`)
    var valorInt=0
    var valorCorrecto:Boolean
    do {
        print("$mensaje ")
        valorCorrecto=scan.hasNextInt()
        if (!valorCorrecto){
            println("ERROR: introdueix un nombre enter")
        }else{
            valorInt=scan.nextInt()
            if (valorInt<intMin || valorInt>intMax){
                valorCorrecto=false
                println("ERROR: introdueix un nombre entre els valors requerits")
            }
        }
        scan.nextLine()
    }while (!valorCorrecto)
    return valorInt
}
fun readDouble(mensaje:String,doubleMin:Int,doubleMax:Int):Int{
    val scan=Scanner(System.`in`)
    var valorDouble=0
    var valorCorrecto:Boolean
    do {
        print("$mensaje ")
        valorCorrecto=scan.hasNextInt()
        if (!valorCorrecto){
            println("ERROR: introdueix un nombre enter")
        }else{
            valorDouble=scan.nextInt()
            if (valorDouble<doubleMin || doubleMin>doubleMax){
                valorCorrecto=false
                println("ERROR: introdueix un nombre entre els valors requerits")
            }
        }
        scan.nextLine()
    }while (!valorCorrecto)
    return valorDouble
}
fun readBoolean(missatge:String):Boolean{
    val scan=Scanner(System.`in`)
    var valorBoolean=false
    var valorCorrecte=false
    do {
        print("$missatge ")
        valorCorrecte=scan.hasNextBoolean()
        if (!valorCorrecte){
            println("ERROR: introdueix un valor correcte")
        } else {
            valorBoolean=scan.nextBoolean()
        }
        scan.nextLine()
    }while (!valorCorrecte)
    return valorBoolean
}