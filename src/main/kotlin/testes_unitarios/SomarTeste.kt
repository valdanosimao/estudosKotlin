package testes_unitarios

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class SomarTeste {

    //como o @Test, informamos ao Kotlin que é uma classe de teste
    @Test
    //quando tiver muitos métodos de testes, fica ruim de indetificarmos, então usamos o @DisplayName
    @DisplayName("Teste de soma")
    fun testaSoma(){
        val somar = somar(4,2)
        val expectativa = 6
        assertEquals(expectativa, somar)
    }

    @Test
    @DisplayName("Teste de Multiplicação")
    fun testaMultiplicacao(){
        val multiplica = multiplicar(2,5)
        val expectativa = 10
        assertEquals(expectativa,multiplica)
    }

    @Test
    //com o Disabled eu informo ao kotlin para colocar ele como desabilitado até eu implementar a lógica
    @Disabled
    fun testeNaoImplementado(){

    }
}