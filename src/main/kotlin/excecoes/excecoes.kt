package excecoes

import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {

    try {
        var s: String? = null
        var a = 3 / 0

        println(s!!.length)
        println(a)

        //tratamos o erro nullPointer
    }catch (e: NullPointerException){
        println("variável nula")

        //tratamos o erro que não pode ser divido por zero
    } catch (a: ArithmeticException){
        println("Não pode ser dividido por zero")

    } finally {
        //o bloco finnaly sempre vai ser executado
        println("Finnaly")
    }

    println("Fim!!")

}