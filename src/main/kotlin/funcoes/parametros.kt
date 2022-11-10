package funcoes

fun main() {

    endereco("Rua B", "Recife","PE", "51224-55") //não fui obrigado a inserir o número

    //aqui informamos o nome do parâmetro, uma forma que facilita a leitura
    endereco2(rua = "Rua C", numero = 5)
}

fun endereco(
    rua: String,
    cidade: String,
    estado: String,
    cep: String,
    num: Int = 0 //caso eu queria que esse parâmetro não seja obrigatório ao instanciar, eu inicializo já aqui
){
}

fun endereco2(
    rua: String,
    numero: Int
){
}
