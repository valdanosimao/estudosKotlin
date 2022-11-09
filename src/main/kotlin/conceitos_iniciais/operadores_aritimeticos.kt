package conceitos_iniciais

/*
Somar ( + )
Subtrair ( - )
Multiplicar ( * )
Divisão ( / )
Módulo ( % ) resto de uma divisão
 */
fun main(){

    var idade = 35
    idade += 20 //mesma coisa que idade = idade + 20
    idade -= 5
    idade * 2
    idade / 2

    //divisão
    var idadeF: Float = 10 / 3F
    println(idadeF)

    //resto
    var idadeR = 10 % 3 //módulo, resto
    println(idadeR)

    //incremento
    var idadeI = 10
    idadeI++ //primeiro usa depois incrementa ex: 10 + 1 = 11
    ++idadeI //primeiro incrementa depois usa ex 1 + 10 = 11
}