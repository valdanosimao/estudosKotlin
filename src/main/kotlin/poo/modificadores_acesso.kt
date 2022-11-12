package poo

/* Modificadores de acesso:
 * São palavras para definir a visibilidade de propiedades e métodos,
 * private -> apenas visível dentro da classe
 * protected -> visível dentro de classe e  para as classes filhas
 * public -> visível  em todo lugar,  caso não seja  definido é o padrão
 */
class Eletronico( private var marca: String){

}

fun main() {
    var eletronico = Eletronico("GEL")
    //eletronico.marca //aqui não temos o acesso a atributo 'marca', pois está como privado

}
