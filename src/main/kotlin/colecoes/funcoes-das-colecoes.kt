package colecoes

/*
 * Any retorna se, uma lista tem valores ou não (true or false)
 * Count retorna a quantidade de elementos
 * First retorna o primeiro item do conjunto e o last o ultimo
 */

fun main() {
    val data = listaDeDados()

    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")

    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas.")

    // Tenho alguma receita de Lasanha?
    println("Tenho receitas de Lasanha? ${if (data.any { it.nome == "Lasanha" }) "sim" else "não"}.")

    // Quantas receitas de Lasanha?
    println("Tenho ${data.count { it.nome == "Lasanha" }} receitas de Lasanha.")

    // Qual a primeira e última receita?
    println("A primeira receita é: ${data.first().nome}.")
    println("A última receita é: ${data.last().nome}.")

    // Caso a lista possa ser vazia
    // data.firstOrNull()
    // data.lastOrNull()

    // Qual a soma de calorias?
    val sumCalories = data.sumOf { it.calorias } //it vai se referir ao objeto que está sendo iterado
    println("A soma de calorias é: $sumCalories")

    // Sei como fazer panqueca? E sushi?
    val knowPanqueke = data.filter { it.nome == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (knowPanqueke) "sim" else "não"}")

    val knowSushi = data.filter { it.nome == "Sushi" }.any()
    println("Sei fazer sushi? ${if (knowSushi) "sim" else "não"}")

    // Quais são as comidas com mais de 500 calorias?
    data.filter { it.calorias > 500 }
        .forEach { println(it.nome) }

    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}")
    }

    // Qual a receita mais calórica? E a menos calórica?
    val maisCal = data.maxByOrNull { it.calorias }
    println("Mais calórica: ${maisCal?.nome}")

    val menosCal = data.minByOrNull { it.calorias }
    println("Menos calórica: ${menosCal?.nome}")

    // Faça uma lista com o nome dos pratos
    data.map { it.nome }

    // Qual a média de caloria de todas as receitas?
    val media = data.map { it.calorias }.average() //média
    println("A média de calorias é: $media.")

    // Lista de dados simples
    val listaInteiros = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    println("Lista distinta: ${listaInteiros.distinct()}.") //valores apenas uma vez

    // Eliminar receitas com mesmo nome
    println(data.distinctBy { it.nome })

    // Ordenar uma lista
    listaInteiros.sorted()
    listaInteiros.sortedDescending()

    // Inverter uma lista
    listaInteiros.reversed()
}

// Retorna lista de dados
private fun listaDeDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)
