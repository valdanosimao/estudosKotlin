package excecoes

/*
 * Por padrão o kotlin trabalha com variáveis não nulas
 * para permitir que ela use o nulo temos que colocar o '?'
 * no tipo da variável.
 *
 * No de termos certeza que não é nula informamos ao kotlin que
 * a variável não é nula com o '!!' e caso seja nula eu assumo p problema
 */
fun main() {

    /* null safety previne que o nosso código não dê erros de exceções
     * ele informa ao kotlin para tratar caso ocorra algum problema
     */
    var str: String? = null
    println(str?.length)

    /*
     * neste exemplo informando para o kotlin não tratar, pois temos
     * certeza que nossa variável não é nula
     */
    var strNull: String? = null
    println(strNull!!.length)

    /*
     * Então o que é null safety?
     * É uma funcionalidade do Kotlin, que tenta previnir que erros aconteçam
     * nas variáveis que podem ser nulas
     */
}
