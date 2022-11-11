package poo

/*
 * A linguagem Kotlin exige que todas as propriedades de uma classe sejam inicializadas
 * durante instanciação de um novo objeto. Ocasionalmente, uma classe necessitará ser instanciada
 * e o desenvolvedor, nesse momento, não tenha todas as propriedades para usar no construtor.
 * Para não precisar tornar essas propriedades anuláveis, por exemplo, de String para String?,
 * você pode usar o modificador de propriedade lateinit. O que é a palavra reservada lateinit?
 * É um modificador que possibilita inicializar a variável depois de sua declaração, ou seja,
 * inicializar tardiamente uma propriedade. Esse recurso dará mais flexibilidade ao programador
 * na linguagem.

 * Como usar lateinit?
 * Esse modificador só pode ser usado por variáveis com referência mutável (var), ou seja, não pode com
 * val (imutável). Também, o tipo deve ser diferente de não nulo (?) e primitivo.
 *
 * Exemplo
 * A seguir temos um trecho de código da classe Pessoa com a variável apelido marcada com lateinit.
 */

fun main() {
    val pessoa = Pessoa2("João da Silva")
    println(pessoa.meApresentar())
}

data class Pessoa2(private val nome: String) {
    private lateinit var apelido: String

    fun meApresentar(): String = "Meu nome é $nome, mas pode me chamar de $apelido"

    fun atribuir(apelido: String) {
        this.apelido = apelido
    }
}
