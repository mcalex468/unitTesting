## Factura de l'Aigua
![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/facturaAigua.jpg)

## MENU

- [Introducció](#Introducció)
- [Advertencies](#Advertencies)
- [Funcions](#Funcions)
- [Funcionament](#Funcionament)
- [Tester](#Tester)

#### Introdució
Aquesta aplicació tracta de diverses preguntes formulades, per poder calcular adequadament el preu final a pagar de quota d'aigua en aquest cas es el cálcul d'un mes. Te diverses funcions (7) , totes aquestes reflexades al MainKt .
Hi han 4 grans pàgines dins "Kotlin" --> 
1. FuncionsKt -> Estàn les diverses estructures(funcions) de l'aplicació
2. MainKt -> On es prova l'execució del programa una vegada trucades les funcions
3. ConsoleColors -> Es poden veure la importació de Colors, utilitzats als missatges
4. Utilities -> Trobem diverses funcions clau que despres s'utilitzen per poder fer més fàcil la construcció del programa

![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/main1.png)
![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/main2%20(1).png)


#### Advertencies

![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/JSDK.png)

Per poder executar aquest programa a un altre ordinador, sense errors a l'hora de l'execució, cal descarregar  SDK "17-AmazonCoretto" .


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

##### Fun familiaNombrosaoMonoparental

![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/func4.png)

##### Fun membres

![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/func5.png)

##### Fun descompteFamiliaoMonoparental

![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/func6.png)

##### Fun boSocial / Fun descompteBoSocial

![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/func7i8.png)


#### Funcionament

Es poden observar les diverses preguntes amb els resultats en una "factura final"

![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/mainFuncionando.png)


![Texto alternativo](https://github.com/mcalex468/unitTesting/blob/master/mainFuncionando1.png)


#### Tester

No funciona correctament a Intellij, per tant no deixa fer push, ho comparteixo aquí per poder veure-ho.

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FuncionsKtTest {
    @Test
    fun testconsumAigua(){
        var expected = 0.15
        assertEquals(expected, consumAigua(50))

        expected = 0.0
        assertEquals(expected, consumAigua(25))

        expected = 0.3
        assertEquals(expected, consumAigua(201))
    }

    @Test
    fun testdescompteFamiliaNombrosaoMonoparental(){
        var expected = 0.4
        assertEquals(expected, descompteFamiliaNombrosaoMonoparental(true,4))

        expected = 0.0
        assertEquals(expected, descompteFamiliaNombrosaoMonoparental(false, 1))

        expected = 0.5
        assertEquals(expected, descompteFamiliaNombrosaoMonoparental(true, 14))
    }

    @Test
    fun testdescompteBoSocial(){
        var expected = 0.0
        assertEquals(expected, descompteBoSocial(false))

        expected = 0.8
        assertEquals(expected, descompteBoSocial(true))
    }
}
