## Factura de l'Aigua
![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/facturaAigua.jpg)

## MENU

- [Introducció](#Introducció)
- [Advertencies](#Advertencies)
- [Funcions](#Funcions)

#### Introdució
Aquesta aplicació tracta de diverses preguntes formulades, per poder calcular adequadament el preu final a pagar de quota d'aigua en aquest cas es el cálcul d'un mes. Te diverses funcions (7) , totes aquestes reflexades al MainKt .
Hi han 4 grans pàgines dins "Kotlin" --> 
1. FuncionsKt -> Estàn les diverses estructures(funcions) de l'aplicació
2. MainKt -> On es prova l'execució del programa una vegada trucades les funcions
3. ConsoleColors -> Es poden veure la importació de Colors, utilitzats als missatges
4. Utilities -> Trobem diverses funcions clau que despres s'utilitzen per poder fer més fàcil la construcció del programa


#### Advertencies

![Texto alternativo](poner enlace del SDK 17 coretto)

Per poder executar aquest programa a un altre ordinador, sense errors a l'hora de l'execució, cal descarregar  SDK "17-AmazonCoretto" .

Apart de tenir les 4 pàgines principals al Main/Kotlin 
FuncionsKt / MainKt / ConsoleColors / Utilities

![Texto alternativo]( poner enlace de SRC/Main/Kotlin )

#### Funcions

##### Fun benvinguda 
Dona la benvinguda al programa !
![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/funcBenvinguda.png)

##### Fun quotaFixa

![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/func1.png)

##### Fun litresConsumits

![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/func2.png)

##### Fun consumAigua


![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/func3.png)

##### Fun familiaNombrosa


##### Fun membres

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
##### Fun descompteFamilia

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

##### Fun descompteBoSocial

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
        descompteBo = 0.2
    }

    return descompteBo
}





