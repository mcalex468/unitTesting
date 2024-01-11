fun main(){
    benvinguda()
    val litres = litresConsumits()
    var quotaFixaPagar = quotaFixa()
    var quotaVariablePagar = consumAigua(litres)
    val esFnombrosa = familiaNombrosaoMonoparental()
    var descompteFnombrosa=0.0
    if (esFnombrosa) {
        val membres = membres()
        descompteFnombrosa = descompteFamiliaNombrosaoMonoparental(esFnombrosa, membres)
    }
    val teBo = boSocial()
    var descompteBo=0.0
    if (teBo){
        descompteBo = descompteBoSocial(teBo)
        quotaFixaPagar-=3
    }
    if (descompteBo>descompteFnombrosa){
        quotaVariablePagar -= quotaVariablePagar * descompteBo
    } else {
        quotaVariablePagar -= quotaVariablePagar * descompteFnombrosa
    }
    val quotaVariableAPagarAmbElsLitres = quotaVariablePagar
    val total = quotaFixaPagar+quotaVariableAPagarAmbElsLitres
    println()
    println(CYAN+"Consum de litres d'aigua és de: "+RED_BOLD_BRIGHT+"${litres}L mensuals"+RESET)
    println(CYAN+"Cost de la quota fixa és de: "+RED_BOLD_BRIGHT+"$quotaFixaPagar€"+RESET)
    println(CYAN+"Cost de la quota variable és de: "+RED_BOLD_BRIGHT+"$quotaVariableAPagarAmbElsLitres€"+RESET)
    println(CYAN+"Import total a pagar és: "+RED_BOLD_BRIGHT+"$total€"+RESET)
    println()
    if (descompteBo>descompteFnombrosa) {
        if (descompteBo==0.0){
            println(WHITE_BOLD_BRIGHT+"No t'has beneficiat de cap descompte"+RESET)
        } else if (quotaVariablePagar!=0.0){
            println(WHITE_BOLD_BRIGHT+"T'has beneficiat del ${descompteBo*100}% descompte en la quota variable i del 50.0% en la fixa"+RESET)
        } else {
            println(WHITE_BOLD_BRIGHT+"T'has beneficiat d'un 50.0%  de descompte en la quota fixa"+RESET)
        }
    } else {
        if (descompteFnombrosa==0.0){
            println(WHITE_BOLD_BRIGHT+"No t'has beneficiat de cap descompte"+RESET)
        } else {
            println(WHITE_BOLD_BRIGHT+"T'has beneficiat d'un  ${descompteFnombrosa*100}% de descompte en la quota variable"+RESET)
        }
    }
}
