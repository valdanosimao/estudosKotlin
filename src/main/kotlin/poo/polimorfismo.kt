package poo

/*
 * Em relação ao polimorfismo, o principal conceito é a propriedade de duas ou mais
 * classes derivadas de uma mesma superclasse responderem a mesma mensagem, cada uma
 * de uma forma diferente. Ocorre quando uma subclasse redefine um método existente
 * na superclasse, ou seja, quando temos os métodos sobrescritos (overriding).
 */
interface Colaborador {
    var salario: Double
    fun bonus(): Double
}

class Gerente2(override var salario: Double) : Colaborador {

    //outro comportamento para o bonus = polimorfimos
    override fun bonus(): Double {
        return salario * 0.5
    }
}

class Analista(override var salario: Double) : Colaborador {

    //outro comportamento para o bonus = polimorfimos
    override fun bonus(): Double {
        return salario * 0.2
    }
}

fun main() {

    var gerente = Gerente2(2000.0)
    println("O Valor do Bonus é : ${gerente.bonus()}")

    var analista = Analista(2000.0)
    println("O Valor do Bonus é : ${analista.bonus()}")
}