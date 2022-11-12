package poo
/*
 * Uma classe é algo que consegue agrupar comportamentos e atributos
 * a classe instancia objetos
 */

class Pessoa(val anoNascimento: Int, val nome: String){

    var apelido: String = ""
    //métodos
    fun dormir(){
    }

    fun acordar(){
    }
}

//fun main(){
//    var pessoa = Pessoa2(2005,"Valdano")
//    pessoa.anoNascimento
//    pessoa.nome
//    pessoa.dormir()
//    pessoa.acordar()
//}

/*
 * Para criar classe no kotlin é da seguinte forma:
   	 class Conta {
	    var titular = "João"
  	       var numeroConta = 545
	}

Para instânciar uma classe no kotlin é da seguinte forma:
         fun main(args: Array<String>) {

		val conta = Conta()
		conta.titular = "Tatiana"
	}

Comportamentos/métodos:
	 class Conta {

       	 var titular = ""
  	   var numeroConta = 0
	   var saldo = 0.0

	fun deposita(valor: Double){
		this.saldo += valor
	        }

	fun saca(valor: Double){
		if(saldo >= valor) {
		     saldo -= valor
		}
	        }

colocando o tipo nos métodos:
	fun transfere(valor: Double, destino: Conta) : Boolean {
		if (saldo >=  valor) {
		    saldo -= valor
		    destino.saldo += valor
		    return true
		}
		    return false
	   }

Métodos Getters and Setters

Toda as vezes que criamos uma properties, implicitamente o kotlin já cria um get e um set pra gente.
para colocar um atributo privado é da seguinte forma:

	class Conta {

       	var titular = ""
  	 var numeroConta = 0
                var saldo = 0.0
	        private  set  // Agora o usuário não terá como alterar o saldo
}

esses métodos abaixo de getters and setters não é bem vindo no kotlin
fun getSaldo() : Double {
		return saldo
		}

	fun setSaldo(valor: Double) {
		saldo = valor
		}

Construtores: Segue a mesma regra do java, por padrão implicitamente já existe um construtor default. Ex: constructor()
   class Conta {
       	var titular = ""
  	 var numeroConta = 0
                var saldo = 0.0
	        private  set

	constructor ( titular: String, numero: int)  {
		this.titular = titular
		this.numeroConta =  numero
 	}
}

Porém este construtor é o construtor secundário, ele só é necessário quando for criar dois construtores, caso queira um outro construtor com alguma função a mais.

Para criar o construtor primário no Kotlin, inserimos na classe e inicializamos as properties

Ex:  class Conta (titular: String, numero: int ) {
       	var titular = titular
  	 var numero = numero
                var saldo = 0.0
	        private  set
}

O Kotlin ainda recomenda, fazer de outra forma, pois ele já entende que os parâmetros passado na classe, já são a properties
Ex:  class Conta (var titular: String, var numero: int ) {
                var saldo = 0.0
	        private  set
}
 */