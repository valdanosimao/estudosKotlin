package conceitos_iniciais

/*
  Crie um programa capaz de atender os requisitos abaixo:
  a. crie um novo arquivo com a função main
  b. declare uma variável mutável capaz de armazenar seu nome completo
  c. declara uma variável do tipo texto sem valor algum
  d. declare uma variável imutável com o menor tipo de dado possível capaz de
  armazenar o número que você calça
  e. declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000)
  f. declare uma variável armazenar a população do Brasil (211.000.000)
  g. imprima o valor do PIB per capita
  h. rode seu programa de maneira que não possua nenhum erro de compilação ou execução
*/

fun main() {

    var nomeCompleto = "Valdano Simão da Silva"
    var textoSemValor: String
    val numeroSapato: Byte = 41
    var pibBrasil: Long = 1869000000000
    var populacaoBrasil = 211000000
    println("O Valor do PIB per capita é: ${pibBrasil/populacaoBrasil}")

}