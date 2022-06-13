package one.digitalinnovation.collection

fun main() {

    val nomes = Array(3) {""}
    nomes [0] = "douglas"
    nomes [1] = "nunes"
    nomes [2] = "oliveira"

    for(nome in nomes){
        println(nome)
    }
    println("--------------------")
    nomes.forEach {
        println(it)
    }
    println("--------------------")
    nomes.sort()
    for(nome in nomes) {
        println(nome)
    }

    println("--------------------")
    val nomes2  = arrayOf("junior","pedro","maria")
    nomes2.sort()
    nomes2.forEach { nomes2 ->
        println(nomes2)

    }

}