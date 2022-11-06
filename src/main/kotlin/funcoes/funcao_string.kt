package funcoes

/*
    Todas as linguagens de programação já existem algumas funções, como por
    exemplo o println() que é da bliblioteca kotlin.io
    io é entrada e saída (in / out)

    a string já tem várias funções
    uma string é uma sequência, uma cadeia de caracteres
*/

fun main() {
    val str = "programação kotlin"
    //propiedade da string
    println("Tamanho da String: ${str.length}")
    println("Posição (index) 0 da string: ${str[0]}")

    //função da string
    println("A Função começa com: ${str.startsWith("h", true)}")
    println("A Função termina com: ${str.endsWith("in", true)}")
    println("O pedaço da string é: ${str.substring(2, 4)}") //pula a posição 2, pega o 3 e pega o 4
    println("Troca uma caractere de uma String: ${str.replace("kotlin", "java", true)}")
    println(str.lowercase()) //converte todas as caracteres e converte para minúsculo
    println(str.uppercase()) //converte todas as caracteres e converte para maiúsculo
    println(str.trim()) //função que corta os espaços em branco, tanto do lado direito, quando do espaço esquerdo, muito usada em formulários
}
