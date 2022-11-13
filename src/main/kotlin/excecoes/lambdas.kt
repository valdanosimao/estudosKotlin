package excecoes

//Lambda é uma função anônima, que pode ser passada por parâmetro
//como toda função, lambda tem retorno, caso não tenha é um Unit

// {parâmetro -> corpo}

fun main() {

    val b = {x: Int -> x * x}
    println("${b(5)}")

    val c = {x: Int, z: Int -> x * z}
    println("${c(2,5)}")

}