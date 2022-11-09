package controle_de_fluxo

/*
 * O retordo do readln é uma String
 */
fun main() {

    quadrado()

    //o readlin sempre vai devolver uma String
    var str = readln()
    println(str)

    //podemos converter para outros valores
    str.toInt()
    println(str)
}

/**
 * Função para saber se é um quadrado
 */
fun quadrado() {
    println("Informe o lado 1:")
    val lado1 = readln()

    println("Informe o lado 2:")
    val lado2 = readln()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("É um quadrado")
        } else {
            println("Não é um quadrado")
        }
    }
}