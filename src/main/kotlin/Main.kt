
fun main() {


    var cuotaFixa = cuotaFixa()
    println(RED+"Bon dia, respon les seguents preguntes per poder fer un cálcul de la factura de l'aigua "+RESET)

    var litres = consumAigua()
        println(BLUE+"$litres€"+RESET)


    val familiaN = familiaNombrosa()
    if (familiaN) {
        val membres = membres()
        val descompte = descompteFamilia(familiaN, membres)
        println(GREEN+"Ha obtingut descompte de $descompte%"+RESET)

        val calculFinal = litres- litres * descompte/100
        println(CYAN+"${calculFinal+cuotaFixa}€"+RESET)
    }

    val descompteBo = descompteBoSocial()
    if ()

    println(descompteBo)






}

