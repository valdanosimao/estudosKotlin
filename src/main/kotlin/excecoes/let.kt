package excecoes

fun main() {

    var str: String? = "Ola"

    //com if
    if (str != null) {
        str.lowercase()
        str.length
        println("Executando com IF")
    }

    /*
     * o let é um if disfarçado, ele só vai ser executado, caso o str for diferente de nulo
     * ele remove o if e deixa o kotlin tratar
     * é uma maneira mais elegante de executar o mesmo código acima
     */
    str?.let {
        it.lowercase()
        it.length
        println("Executando com LET")
    }
    //OBS: O IT É A NOSSA VARIÁVEL
}
