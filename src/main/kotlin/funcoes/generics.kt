package funcoes

fun main() {

    //com o generics agora podemos passar qualquer tipo
    println(media(2.3, 7.8, 5.7, "", false))

}

//essa é a forma de declararmos uma função com generics
fun <T> media(vararg notas: T): Double {
    var soma = 0.0
    for (n in notas) {

        //se a minha variável for do tipo float ela vai fazer a soma
        //não importa se eu informar uma String ou Booleano nos meus parâmetros
        //por causa do GENERICS
        if (n is Double) {
            soma += n
        }
    }
    return (soma / notas.size)
}
