fun main() {
    val cuotaFixa = cuotaFixa()


    println(RED + "Bon dia, respon les seguents preguntes per poder fer un cálcul de la factura de l'aigua " + RESET)

    var litres = consumAigua()
    println(BLUE + "Preu Variable a pagar: $litres€" + RESET)


    val familiaN = familiaNombrosa()
    if (familiaN) {
        val membres = membres()
        val descompte = descompteFamilia(familiaN, membres)
        println(GREEN + "Ha obtingut descompte de $descompte%" + RESET)

        val calculFinal = litres - litres * descompte / 100
        println(CYAN + "Preu Final a pagar: ${calculFinal + cuotaFixa}€" + RESET)
    }

    val descompteBo = descompteBoSocial() * litres + (cuotaFixa / 2)

    println(YELLOW + "Finalment has de pagar : $descompteBo € ja que poseeixes Bo Social" + RESET)


    // Llamada a la función facturaDesglosada para mostrar la factura desglosada

}
