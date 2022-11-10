package funcoes

fun main() {
    println(media(2.3,7.8, 5.7))
}

/*
 * Com o vararg, posso ter N números de notas
 */
fun media(vararg notas: Double): Double {
    var soma = 0.0
    for(n in notas)
        soma += n
    return (soma/notas.size)
}