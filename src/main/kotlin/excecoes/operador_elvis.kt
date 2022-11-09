package excecoes

fun main() {
    val str: String? = null

    //podemos simplificar essa lógica que verifica se é nulo com o operador Elvis
    if (str == null) {
        println("Nulo")
    } else {
        println(str)
    }

    //operador Elvis, verifica a variável a esquerda, e caso ela seja nula, ele executa a instrução a direita
    //transformamos cinco linhas do exemplo acima, em apenas uma linha
    println(str ?: "null")
    //println(str ?: soma())

}