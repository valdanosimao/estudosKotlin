package colecoes

/**
 * Coleçõs - Grupo de valores variável
 * Uma coleção geralmente contém um número de objetos (também pode ser zero) do mesmo tipo.
 *
 * Os tipos de coleção abaixo serão tratados:
 * - List
 * - Set
 * - Map
 *
 * Coleções podem ser mutáveis ou imutáveis. Assim como as variáveis declaradas com var e val,
 * seguem o mesmo conceito.
 *
 * Mutáveis - Uma vez criada, podem ser alteradas para adicionar, remover ou atualizar valores.
 * Imutáveis - Uma vez criada, não é possível adicionar ou remover valores, somente obter.
 */
fun main() {

    val listaUm: List<Int> = listOf(1,2,3,4)

    val listaDois: MutableList<Int> =  mutableListOf(1,2,3,4)
    listaDois.add(5,)
    listaDois.remove(2)
    listaDois.removeAt(0)//remove pelo index

    //listOf = é imutavel, não adiciona elementos
    val planetasImu = listOf("Mercurio", "Terra", "Jupiter", "Marte")
    print(planetasImu[3])

    //mutableListOf= é mutavel, ele permite adicionar elementos
    val planetasMu = mutableListOf("Mercurio", "Terra", "Jupiter", "Marte")
    planetasMu.add("Venus")
    print(planetasMu[4])

    //informando o tipo de lista após a variável, deixamos claro que queremos uma lista vazia
    val planetasVazio: MutableList<String> = mutableListOf()
    println(planetasVazio)

    //adcionamos um planeta
    planetasVazio.add("Urano")
    println(planetasVazio)

    //adicionamos uma lista mutavel da classe Terra
    val planetaTerra: MutableList<Terra> = mutableListOf()
    planetaTerra.add(Terra("Pernambuco", 18975227))
    planetaTerra.add(Terra("São Paulo", 478516255))

    for (terra in planetaTerra){
        println(terra)
    }
}

class Terra(estado: String, capacidade: Int) {

}
