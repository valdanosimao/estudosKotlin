package poo

/*
 * Para autorizarmos uma classe a ser herdade, temos que inserir a palavra reservada 'open'
 * ao herdamos uma classe precisamos sobrescrever seus métodos, e usamos a palavra reservado 'override'
 * também precisamos autotizar usando o open nos métodos de classe mãe para autorizarmos a sobrescrita
 */

//classe mãe que vai ser herdada
open class ClasseMae() {
    open fun acordar() {
        println("Acordei")
    }

    open fun dormir() {
        println("ZZzzzZZZz")
    }

    open fun roncar() {
        println("uuuuuuuooooooo")
    }
}

//classe filha que herda da mãe e herda tbm seus atributos e métodos
class ClasseFilha() : ClasseMae() {

    //override - sobrescrita do método
    override fun acordar() {
        println("Classe Filha acordou")
    }

    //override - sobrescrita do método
    override fun dormir() {
        println("zzzzZZZZZ")

        //para chamarmos o método da classe mãe, usamos o 'super'
        super.acordar()
    }

    //override - sobrescrita do método
    override fun roncar() {}

    //overload, sobre-carga do método, ele tem o mesmo nome de função mas a assinatura(quantidade e tipo de parâmetro) diferentes
    fun roncar(barulho: String) {
        println("eeeeeeeeiiiiiiaaaa")
    }

    //overload, sobre-carga do método, ele tem o mesmo nome de função mas a assinatura(quantidade e tipo de parâmetro) diferentes
    fun roncar(barulho: String, duracao: Int) {
        println("uuuiiiiuuuuii")
    }
}