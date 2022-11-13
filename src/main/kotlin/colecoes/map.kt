package colecoes

fun main() {

    val map1 = mapOf<String, Int>(Pair("Brasil",158)) //Brasil é minha chave, e o numero inteiro é o valor
    println(map1.entries)
    println(map1.values)

    val map2 = mutableMapOf<String,Int>(Pair("Argentina", 2547))
    map2.contains("Argentina")

    val pedidos = mapOf(3 to "Carro",4 to "Moto",Pair(1,"outro"))
    for(pedido in pedidos){
        print(" chave ${pedido.key} ")
        print(" valor ${pedido.value} ")
    }

    // Com o mutableMapOf,  podemos adicionar mais elementos com o 'put' pedidos.put(8,"Chave")
}