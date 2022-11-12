package poo

class Matematica {

    //dentro do companion object, vamos escrever variáveis e funções que são estáticas
    //tipo static do java
    companion object {
        val PI = 3.1415
        fun teste() {}
    }
}

fun main() {

    //como no java, quando é static, pertence a classe e não ao objeto
    Matematica.PI
    Matematica.teste()

}