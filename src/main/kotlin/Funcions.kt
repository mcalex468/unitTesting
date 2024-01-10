fun consumAigua(): Double {
    var cuotaVariable = 0.0
    var cuotaFixa = 6
    val consum = readInt("Indica els litres que consums al mes", 0, 1000)
    when (consum) {
        in (0..49) -> cuotaVariable = cuotaFixa + 0.0 * consum
        in (50..200) -> cuotaVariable = (cuotaFixa + 0.15 * consum).toDouble()
        in (200..999999999) -> cuotaVariable = (cuotaFixa + 0.30 * consum).toDouble()

    }
    return cuotaVariable
}


fun familiaNombrosa(): Boolean {

    val nombrosaMonoparental = readBoolean("Sou familia nombrosa ( S / N) ?")
    return nombrosaMonoparental
}

fun membres(): Int {

    val membres = readInt("Cuants integrants sou ?", 1, 10)
    return membres
}

fun descompteFamilia ( familia : Boolean, membres : Int ) : Int {
    var descompte = 0
    if (familia) {
        descompte = membres * 10
        if ( descompte >= 50)
            println("Nomes s'aplica fins 50% !")
        descompte = 50

    }
    return descompte
}






/** fun boSocial() {
    println(" Poseeixen Bo Social? ")
    var boSocial = readBoolean()
    when (boSocial) {
        consumAigua()

    }

}
 **/