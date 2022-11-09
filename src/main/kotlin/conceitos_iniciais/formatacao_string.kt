package conceitos_iniciais

fun main(){
    val nome = "Valdano"
    val sobrenome = "Simão"

    //para concatenar no kotlin é da seguinte forma
    println("Olá meu nome é $nome $sobrenome")

    //usamos as chaves para informar ao kotlin a propiedade que vai acessar
    println("Double ${Double.MIN_VALUE}")

    //uma String tem uma tamanho e acessamos ele através do length
    nome.length
}

