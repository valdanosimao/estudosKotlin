package controle_de_fluxo

fun main() {

    /*
     *  estudando when
     */
    var cargo = ""
    when (cargo) {
        "gerente" -> 2000f
        "coordenador" -> 1500f
        "engenheiro de software" -> 1000f
        "estagiario" -> 500f
        else -> "nenhum"
    }

    /*
    *  estudando when
    */
    when (1) {
        1 -> println("Opção um")
        2 -> println("Opção dois")
        else -> println("nenhum")
    }

    /*
    *  estudando when com range
    */
    when (1) {
        in 1..10 -> println("1..10")
        in 11..20 -> println("11..20")
        in 21..30 -> println("21..30")
    }
}