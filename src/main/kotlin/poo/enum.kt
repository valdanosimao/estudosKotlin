package poo

/*
 * enum - enumerador (listar possíveis valores)
 * enums são um conjunto de constantes, de valores imutaveis
 */

enum class Prioridade {
    BAIXO,
    MEDIA,
    ALTO
}

enum class statusPedido {
    PROCESSANDO,
    APROVADO,
    REPROVADO
}

class Pedido {
    var status = statusPedido.PROCESSANDO
}

fun main() {
    Prioridade.ALTO
}