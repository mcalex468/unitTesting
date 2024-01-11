/**
 * Retorna la cuota fixa mensual.
 *
 * @return La cuota fixa mensual.
 * @author mcalex468
 * @since 10/01/23
 */
fun quotaFixa(): Double {
    // La cuota fixa és un valor constant de 6.0 euros.
    val cuotaFixa = 6.0
    return cuotaFixa
}

/**
 * Aquesta funció serveix per preguntar a l'usuari els litres consumits en el mes actual
 *
 * @return El número de litros consumidos por el usuario.
 * @author mcalex468
 * @since 10/01/23
 */
fun litresConsumits(): Int {
    // Solicitamos al usuario que ingrese la cantidad de litros consumidos al mes.
    return readInt("Indica els litres que consums al mes:", 0, 1000)
}

/**
 * Calcula la cuota variable basada en el consumo mensual d'aigua.
 *
 * @param litresConsum Cantidad de litros consumidos en el mes.
 * @return La cuota variable calculada.
 * @author mcalex468
 * @since 10/01/23
 */
fun consumAigua(litresConsum: Int): Double {
    // Inicializamos la cuota variable a 0.0.
    var cuotaVariable = 0.0

    // Calcular la cuota variable basada en el consumo.
    when (litresConsum) {
        in (0..49) -> cuotaVariable = 0.0 * litresConsum // No se paga cuota variable para consumos menores a 50 litros.
        in (50..200) -> cuotaVariable =
            (0.15 * litresConsum).toDouble() // Se aplica un precio de 0.15€ por litro para consumos entre 50 y 200 litros.
        in (200..999999999) -> cuotaVariable =
            (0.30 * litresConsum).toDouble() // Se aplica un precio de 0.30€ por litro para consumos mayores a 200 litros.
    }

    return cuotaVariable
}

/**
 * Pregunta si la familia és nombrosa o monoparental.
 *
 * @return True si la familia és nombrosa o monoparental, False si no.
 * @author mcalex468
 * @since 10/01/23
 */
fun familiaNombrosaoMonoparental(): Boolean {
    // Se solicita al usuario que indique si son una familia nombrosa o monoparental (Sí/No).
    return readBoolean(YELLOW+"Sou familia nombrosa o monomarental " +
            "("+PURPLE+"true"+PURPLE+" o "+BLUE+"false"+BLUE+")?:"+RESET)
}

/**
 * Pregunta por el número de miembros de la familia.
 *
 * @return El número de miembros de la familia.
 * @author mcalex468
 * @since 10/01/23
 */
fun membres(): Int {
    // Solicitamos al usuario que ingrese el número de integrantes de la familia (entre 1 y 10).
    val membres = readInt("Cuants integrants sou a la familia?", 1, 10)
    return membres
}

/**
 * Calcula el descuento para familias numerosas o monoparentales.
 *
 * @param familia Indica si la familia es numerosa o monoparental.
 * @param membres Número de miembros de la familia.
 * @return El descuento calculado.
 * @author mcalex468
 * @since 10/01/23
 */
fun descompteFamiliaNombrosaoMonoparental(familia: Boolean, membres: Int): Double {
    // Inicializamos el descuento a 0.
    var descompte = 0.0

    // Verificamos si la familia es numerosa o monoparental.
    if (familia) {
        // Calculamos el descuento como un 10% por cada miembro, con un máximo del 50%.
        descompte = membres * 0.1
        // Limitamos el descuento al 50% si supera ese valor.
        if (descompte > 0.5)
            descompte = 0.5
    }

    return descompte
}

/**
 * Calcula el descuento para el Bono Social.
 *
 * @return True si el usuario posee el Bono Social, False si no.
 * @author mcalex468
 * @since 10/01/23
 */
fun boSocial(): Boolean {
    // Inicializamos el descuento del Bono Social a 0.0.
    var descompteBo = 0.0

    // Se pregunta al usuario si posee el Bono Social (true/false).
    val boSocial = readBoolean(
        "Poseeixes Bo Social" +
                "(" + PURPLE_BOLD_BRIGHT + "true" + PURPLE + " o " + PURPLE_BOLD_BRIGHT + "false" + PURPLE + ")?:" + RESET
    )
    return boSocial
}

/**
 * Calcula el descuento para el Bono Social.
 *
 * @param teBoSocial Indica si el usuario posee el Bono Social.
 * @return El descuento calculado para el Bono Social.
 * @author mcalex468
 * @since 10/01/23
 */
fun descompteBoSocial(teBoSocial: Boolean): Double {
    var descompteBo = 0.0
    // Si posee el Bono Social, se aplica un descuento del 80%.
    if (teBoSocial) {
        descompteBo = 0.8
    }

    return descompteBo
}

/**
 * Imprime un mensaje de bienvenida para la factura del agua.
 */
fun benvinguda() {
    println(BLACK_BOLD_BRIGHT+"FACTURA DE L'AIGUA"+RESET)
    println()
}
