package conceitos_iniciais

/*
Type      Bit(tamanho do espaço na memória)
Double    64
Float     32
Long      64
Int       32
Short     16
Byte      8
Boolean   ?
String    ?
Char      ?
 */
fun main() {

    var c: Char = 'a'
    var s: String = "Variavei String"
    var b: Boolean = true
    var d: Double = 10.0
    var f: Float = 5.0F
    var l: Long = 100
    var i: Int = 20
    var sh: Short = 10
    var by: Byte = 10

    var km = 800F

    /*
    dica, forçar um Long, Float é importante em algumas situações
    por exemplo, criei uma variável var km = 800 , neste caso
    essa variável está como Int, mas para quilometragens é
    mais interessante que seja Double ou Float então colocando o
    tipo: var km: Double = 800, ou então forçamos var km =800F
     */

    //imprimindo o máximo de mínimo de bytes de cada tipo
    println("Double MAX ${Double.MAX_VALUE} -MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} -MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} -MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} -MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} -MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} -MIN ${Byte.MIN_VALUE}")

    /*
       tipos de dados Unsigner, São os tipos sem sinal
       vimos que o Byte pode variar de -127 à 127
       porém um número Unsigner, ele varia do 0 ao 255
       então ele perde a parte negativa
       em alguns caso não queremos que uma variável tenha
       um número negativo, por exemplo os centimetros de uma tv
       Exemplo: var centrimetosTv: UInt = -125 vai dar erro
     */

    var centrimetosTv: UInt = 1u //temos que colocar o 'u' ao final do número
    var abc: ULong = 1548787u

    //imprimindo o máximo de mínimo de bytes de cada tipo inteiros
    println("ULong MAX - ${ULong.MAX_VALUE} - ${ULong.MIN_VALUE}")
    println("UInt MAX - ${UInt.MAX_VALUE} - ${UInt.MIN_VALUE}")
    println("UShort MAX - ${UShort.MAX_VALUE} - ${UShort.MIN_VALUE}")
    println("UByte MAX - ${UByte.MAX_VALUE} - ${UByte.MIN_VALUE}")

}