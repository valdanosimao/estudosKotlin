package funcoes

/*
    O que é uma função? função é uma pequena parte do programa que possui uma
    reponsabilidade específica e pode ser usada quando necessário

    toda função começa com a declaração 'fun' seguido por ' nome da função',
    'identificação', 'parâmetro'(podendo ter ou não), 'tipo', 'tipo de retorno' e corpo da função
    quando tiver um tipo de retorno o return é obrigatório
    ex:
    fun olaMundo(nome: String) : String {
        return "Olá, $nome!"
     }

     ##Unit
     o tipo Unit diz que uma função não possui retorno. A função executa seu corpoe e termina sua execução
     fun funcaoSemRetorno(): Unit{
        //não precisamos declarar o tipo Unit, pois é redundante
     }

     outros tipos de retorno é o que já estudei
     Double, Float etc

     uma função também pode executar seu corpo e fornecer uma resposta para seu chamado. Os mesmo tipos que
     são usados para a declaração de variáveis, servem como retorno de funções

     instância de classes
     uma função é capaz de retornar um tipo de dado resultante da instância de uma classe
*/

fun main() {
    ola()
}
//função sem retorno
fun ola(){
    println("Olá Mundo")
}

//função com retorno
fun soma(a: Int, b: Int): Int{
    return (a + b)
}

//função com apenas uma única instrução, pode ser de apenas uma linha
fun somar (a: Int, b: Int) = a + b
fun olaMundo() = println("Olá Mundo")


