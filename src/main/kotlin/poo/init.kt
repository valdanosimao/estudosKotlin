package poo

class Animal(var especie: String){

    //O que é o bloco init? é uma inicialização, ela vai ser executado quando a classe for instânciada
    init {
        println("Olá Humanos")
    }
}

fun main() {
    Animal("Leão")
}