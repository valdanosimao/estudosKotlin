package colecoes
/*
 * Set é um conjunto não ordenado
 * o set não permite elementos repetidos
 * tbm implementa a Collection e com isso tem os métodos add, remove, etc
*/
fun main() {

    val set1: Set<String> = setOf<String>()

    val set2: MutableSet<String> = mutableSetOf<String>()

    val planetasMuSet = mutableSetOf("Mercurio", "Terra", "Jupiter", "Marte")
    planetasMuSet.add("Mercurio")
    println("PLANETAS SET $planetasMuSet ")
}

