package poo

/*
 * Em Kotlin, uma propriedade não requer métodos getter ou setter explícitos:
 * O getter e setter padrão é um padrão familiar que vemos em Java, mas em Kotlin,
 * não precisamos criar um campo de apoio privado para a propriedade.
 */
class Conta {

    var titular = ""
    var numeroConta = 0
    var saldo = 0.0
        private  set  // Agora o usuário não terá como alterar o saldo
}

//esses métodos abaixo de getters and setters não é bem vindo no kotlin
//fun getSaldo() : Double {
//    return saldo
//}
//
//fun setSaldo(valor: Double) {
//    saldo = valor
//}

