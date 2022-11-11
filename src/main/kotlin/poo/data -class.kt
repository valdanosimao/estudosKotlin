package poo

/*
 * que é uma data class?
 * As data classes tem como objetivo representar dados de uma forma estruturada.
 * Porém sem as necessidades de se definir toString, equals, hashCode e outros métodos.
 * Também não é necessário implementar os getters and setters, mas isso não é exclusividade
 * da data class, e sim uma peculiaridade da linguagem kotlin que trata  os atributos como
 * propiedades. Dessa forma, os acessamos  diretamente sem a necessidade dos getters and setters.
 */

fun main() {

}

//aqui aceita atributos sem o var ou val
class ClasseNormal(a: Int, b: Int)

//no DataClasse é obrigatório ter var ou val
data class DataClasse(var a: Int, var b: Int)