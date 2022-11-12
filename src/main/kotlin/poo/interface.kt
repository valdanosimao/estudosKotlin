package poo

/*
 * uma interface é um contrato que define os métodos que, quem a implementa tem que instancialos
 * diferenta das classes abstrata, que são herdadas, a interface é implementadas
 * uma interfce não tem como manter estado(ter valor, ex: Int, Double etc), inicializadores não são permitidos
 * a principal diferença entre classes abstrata e interface é essa, a classe abstrata consegue manter estado, a interface não
 * podemos implementar mais de uma interfaces
 */
interface Selvagem {
    //este método vai ter que ser implementado por quem implementar essa interface
    fun atacar()

    //val teste = "" uma interfce não tem como manter estado(ter valor, ex: Int, Double etc)
}

abstract class Mamifero2(val nome: String) {
    fun acordar() {}
    fun dormir() {}
    abstract fun falar() //método abstrato,
}

class Cachorro2(nome: String) : Mamifero2(nome), Selvagem { //implementando a interface selvagem

    override fun falar() {
        println("Au AU AU")
    }

    override fun atacar() {
        println("INHAACKKKK")
    }
}