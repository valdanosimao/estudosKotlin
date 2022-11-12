package poo

/*
 * Sempre que herdamos de uma classe abstrata, temos que implementar seus métodos
 * uma classe abstrata não pode ser instânciada, a intenção dela é servi de um molde
 * é servir de molde para as classes que vão herda-la
 */

abstract class Mamifero(val nome: String){
    fun acordar(){}
    fun dormir(){}
    abstract fun falar() //método abstrato,
}

class Cachorro(nome: String) : Mamifero(nome){

    override fun falar() {
        println("AU AU AU")
    }
}

fun main(){
    var cachoro = Cachorro("Linux")
    cachoro.falar()
}