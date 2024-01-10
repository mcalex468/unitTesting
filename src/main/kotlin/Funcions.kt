/**
 * Retorna la cuota fixa mensual.
 *
 * @return La cuota fixa mensual.
 */
fun cuotaFixa(): Double {
    // La cuota fixa és un valor constant de 6.0 euros.
    val cuotaFixa = 6.0
    return cuotaFixa
}

/**
 * Calcula la cuota variable basada en el consumo mensual d'aigua.
 *
 * @return La cuota variable calculada.
 */
fun consumAigua(): Double {
    // Inicializamos la cuota variable a 0.0.
    var cuotaVariable = 0.0

    // Solicitamos al usuario que ingrese la cantidad de litros consumidos al mes.
    val consum = readInt("Indica els litres que consums al mes", 0, 1000)

    // Calcular la cuota variable basada en el consumo.
    when (consum) {
        in (0..49) -> cuotaVariable = 0.0 * consum // No se paga cuota variable para consumos menores a 50 litros.
        in (50..200) -> cuotaVariable = (0.15 * consum).toDouble() // Se aplica un precio de 0.15€ por litro para consumos entre 50 y 200 litros.
        in (200..999999999) -> cuotaVariable = (0.30 * consum).toDouble() // Se aplica un precio de 0.30€ por litro para consumos mayores a 200 litros.
    }

    return cuotaVariable
}

/**
 * Pregunta si la familia és nombrosa o monoparental.
 *
 * @return True si la familia és nombrosa o monoparental, False si no.
 */
fun familiaNombrosa(): Boolean {
    // Se solicita al usuario que indique si son una familia nombrosa o monoparental (Sí/No).
    val nombrosaMonoparental = readBoolean("Sou familia nombrosa (S / N)?")
    return nombrosaMonoparental
}

/**
 * Pregunta por el número de miembros de la familia.
 *
 * @return El número de miembros de la familia.
 */
fun membres(): Int {
    // Solicitamos al usuario que ingrese el número de integrantes de la familia (entre 1 y 10).
    val membres = readInt("Cuants integrants sou?", 1, 10)
    return membres
}

/**
 * Calcula el descuento para familias numerosas o monoparentales.
 *
 * @param familia Indica si la familia es numerosa o monoparental.
 * @param membres Número de miembros de la familia.
 * @return El descuento calculado.
 */
fun descompteFamilia(familia: Boolean, membres: Int): Int {
    // Inicializamos el descuento a 0.
    var descompte = 0

    // Verificamos si la familia es numerosa o monoparental.
    if (familia) {
        // Calculamos el descuento como un 10% por cada miembro, con un máximo del 50%.
        descompte = membres * 10
        // Limitamos el descuento al 50% si supera ese valor.
        if (descompte > 50)
            descompte = 50
    }

    return descompte
}

/**
 * Calcula el descuento para el Bono Social.
 *
 * @return El descuento calculado para el Bono Social.
 */
fun descompteBoSocial(): Double {
    // Inicializamos el descuento del Bono Social a 0.0.
    var descompteBo = 0.0

    // Se pregunta al usuario si posee el Bono Social (Sí/No).
    val boSocial = readBoolean("Poseeixes Bo Social?")

    // Si posee el Bono Social, se aplica un descuento del 80%.
    if (boSocial) {
        descompteBo = 0.8
    }

    return descompteBo
}





