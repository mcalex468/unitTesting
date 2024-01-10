
fun main() {

    // Inici
    println("Bon dia, quant consum en litres teniu ?")
    var litres = consumAigua()
        println(litres)
    //

    val familiaN = familiaNombrosa()
    if (familiaN) {
        val membres = membres()
        val descompte = descompteFamilia(familiaN,membres)
    }

}

