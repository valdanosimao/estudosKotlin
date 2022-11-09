package controle_de_fluxo
/*
 * 1º Escreva um programa para ajudar a empresa Kotlin calcular o bônus que os
 * funionários receberão no final do ano. Os bônus são classificados por cargo
 * a. Gerentes recebem R$ 2.000,00
 * b. Coordenadores recebem R$ 1.500,00
 * c. Engenheiros de software recebem R$ 1.000,00
 * d. Estagiários recebem R$ 500,00
 */
fun calcularBonus(cargo: String) {

    if (cargo.equals("gerente", true)) {
        println("Seu Bonus é 2.000,00")
    } else if (cargo.equals("coordenador", true)) {
        println("Seu Bonus é 1.500,00")
    } else if (cargo.equals("engenheiro", true)) {
        println("Seu Bonus é 1.000,00")
    } else if (cargo.equals("estagiario", true)) {
        println("Seu Bonus é 500")
    } else {
        println("Cargo Inexistente!")
    }
}

/*
 * Modifique o primeiro execício para considerar o tempo de experiência no cálculo de bônus
 * a. gerente com menos de 2 anos de experiência recebem R$ 2.000.00, caso contrário recebem R$ 3.000.00
 * b. coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
 * c. engenheiros de software recebem R$ 1.000,00
 * d. estagiários recebem R$ 500,00
 *
 */
fun calcularBonusPorExperiencia(cargo: String, experiencia: Int) {

    /*
     * Clarando esse código é totalmente errado, feio e claro que não vou fazer assim
     * estou acompanhando os exercícios do curso.
     */
    if (cargo.equals("gerente", true) && experiencia > 2) {
        println("Seu Bonus é 3.000,00")
    } else if (cargo.equals("gerente", true) && experiencia < 2) {
        println("Seu Bonus é 2.000,00")
    } else if (cargo.equals("coordenador", true) && experiencia > 1) {
        println("Seu Bonus é 1.800,00")
    } else if (cargo.equals("coordenador", true) && experiencia < 1) {
        println("Seu Bonus é 1.500,00")
    } else if (cargo.equals("engenheiro", true)) {
        println("Seu Bonus é 1.000,00")
    } else if (cargo.equals("estagiario", true)) {
        println("Seu Bonus é 500")
    } else {
        println("Cargo Inexistente!")
    }
}

/**
 * Função para executar o programa
 */
fun main() {
    calcularBonus("estagiario")
    calcularBonusPorExperiencia("gerente", 3)
}