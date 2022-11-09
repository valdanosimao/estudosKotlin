package controle_de_fluxo

/*
 * o do-while sempre vai executar no mínimo uma vez, independente se a condição for verdadeira
 */
fun main() {
    do {
        print("Qual o seu nome? ")
        val value = readln()
    } while (value == "")
}
