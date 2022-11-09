package controle_de_fluxo

fun main() {
    //range, quer dizer que o intervalo é de 1 à 3
    for (i in 1..3) {
        println(i)
    }

    //OBS: o In dentro do for vai fazer uma coisa, dentro do if vai fazer outra
    var alfabeto = 'a'..'z'
    val letra = 'k'
    print(letra in alfabeto)

    //faz inverso, inicia no 5 e termina no 1, para isso o 'downTo'
    for (i in 5 downTo 1) {
        println(i)
    }

    //no modo padrão ele pula de 1 e 1, com o 'step', podemos alterar isso
    for (i in 5 downTo 1 step 2) {
        println(i)
    }

    //caso queira parar em uma certa condição
    for (i in 5 downTo 1 step 2) {

        if (i == 4) {
            break
        }
    }

//    caso queira pular em um certo número
//    if(i ==4) {
//        continue //ele pula quando o 4 chegar
//    }
}


