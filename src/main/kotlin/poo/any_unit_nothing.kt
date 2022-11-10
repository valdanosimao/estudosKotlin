package poo

fun main() {

    /*
     * Any, Unit e Nothing
     * Todos os tipos que connhecemos, Int, String, Boolean etc, eles herdam de 'Any'
     */
    fun valores(value: Any) {

    }

    //aqui posso passar qualquer tipo, pois Int, herda de Any
    //ele está tendo o mesmo comportamento de generics
    valores(2)

    /*
     * Unit denota que nossa função não vai ter um retorno, caso não colocamos nada por padrão é Unit, sento assim não é preciso inserir o Unit
     */
    fun valores2(): Unit {
        //não precisamos declarar Unit
    }

    /*
     * O Nothing é um tipo de dado, mas ele não tem retorno
     * Ele é usado quando requermos retornar uma exceção
     */
    fun valores3(value: Any): Nothing {
        TODO("Não Implentado")//quando queremos passar uma coisa que, não fizemos ainda
    }
}