package conceitos_iniciais

/*
Ao criar uma variável é obrigatório informar se ela vai poder mudar ou não o seu valor.
Ao criar uma variávei é obrigatório inicializa-la
O kotlin implicitamente já sabe qual o tipo da variavel, se é String, int etc,
ao contrário do java que é fortemente tipada.
Caso queira colocar o tipo da variavel é da seguinte forma: val titular: String = "valdano"
*/
class Variaveis {
    fun main(){
        //var = pode ser modificada
        var nome = "Valdano"

        //val = não pode ser modificada
        val rg = 7551
    }
}