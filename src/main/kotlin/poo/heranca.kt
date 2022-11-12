package poo

/*
Herança:
Por padrão todas as classes do kotlin não pode ser herdadas,  para fazer que uma classe pai
possa ser herdada, inserimos antes do nome class a palavra open

Ex:
open class Animal(){
    fun dormir(){
        println("Dormindo")
    }
}
*/

open class Funcionario(  //para autorizar que essa classe seja herdade, colocamos 'open'
    val nome: String,
    val cpf: String,
    var salario: Double
) {

    fun falarNome() {
        println("Olá meu nome é : $nome")
    }

}

//A classe Gerente vai herdar da classe Funcionario
class Gerente(
    var idade: Int,
    val sexo: String
) : Funcionario(
    nome = "",
    cpf = "",
    salario = 0.0
) {

}

/*
 * No kotlin não existe herança multipla
 */