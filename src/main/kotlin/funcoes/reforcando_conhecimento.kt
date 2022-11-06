package funcoes

fun main() {
    calcularQuantidadeAnos(2)
    calcularQuantidadeCaracteres("Olá que curso massa de kotlin")
    converterMilhas(100f)
}

/**
 * 1º Escreva uma função que seja capaz de receber a quantidade de anos e transformar
em meses, dias, horas, minutos e segundos. Saída desejada:

2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos
 */
fun calcularQuantidadeAnos(anos: Int) {

    println("$anos anos equivalem á: ")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")

}

/**
 * 2º Escreva uma função capaz de receber uma String e retornar a quantidade de caracteres
 */
fun calcularQuantidadeCaracteres(str: String) {
    println("A quantidade de caracteres inseridas é: ${str.length}")
}

/**
 * 3º Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n)
 */
fun calcularCubo(numero: Int): Int {
    return numero * numero * numero
}

/**
 * 4º Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km)
 */
fun converterMilhas(milha: Float){
    println("${milha * 1.6f}")

}