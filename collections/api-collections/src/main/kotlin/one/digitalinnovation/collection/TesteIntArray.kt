package one.digitalinnovation.collection

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 3
    values[3] = 6
    values[4] = 2

    println("primeira forma usando variavel \n" )
    for (valor in values){
        println(valor)
    }
    println("segunda forma usando forEach\n")
    values.forEach{//forEach usa o (it) como uma variavel no caso o contador
        println(it)
    }
    println("terceira forma usando forEach + variavel\n" )
    values.forEach { valor ->
        println(valor)
    }
    println("quarta forma usando index + indices\n" )
    for (index in values.indices){ // trabalha com a iteração em cima do proprio indice
    println(values[index])
    }
    println("quinta forma usando sort\n" )
    values.sort() // ordena do menor para maior
    for (index in values.indices){ // trabalha com a iteração em cima do proprio indice
        println(values[index])}
}