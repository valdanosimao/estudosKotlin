package controle_de_fluxo

fun main() {

    //break
    var i = 0
    while (i < 100000) {
        if (i == 15) {
            break
        }

        print("$i ")
        i++
    }

    //continue
    var y = 0
    while (y < 10) {
        if (y == 6) {
            continue
        }
        print("$y ")
        y++
    }
}