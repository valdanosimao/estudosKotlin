package controle_de_fluxo

/**
 * Controle de fluxo - if
 * Um controle de fluxo if só é executada se a condição for verdadeira
 * em outras palavras, a condição que o if usa para avaliar é sempre Boolean (true or false)
 * else: caso a condicção do if seja false,ou seja não verdadeira,  ele executa o bloco else
 *
 * #Dica: um if dentro de outro é uma má prática
 */
fun main() {

    maiorIdade(12)
    maiorIdade(21)

}

/**
 * função para estudo de 'if-else'
 */
fun maiorIdade(idade: Int) {
    if (idade > 18) {
        println("Adulto")
    } else if (idade in 13..17) {
        println("Adolecente")
    } else {
        println("Criança")
    }
}

/**
 * Função para estudo de 'return if'
 * o kotlin fez com que o if-else fosse uma instrução
 * é muito interessante quando temos if-else
 */
fun saudacao(dia: Boolean): String {
    return if (dia) {
        "Bom dia"
    } else {
        "Boa noite"
    }
}


