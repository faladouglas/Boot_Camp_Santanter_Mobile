package one.digitalinnovation.collection

fun main() {

    val pair :Pair<String,Double> = Pair("Douglas",1000.0)
    val mapi = mapOf(pair)

    mapi.forEach{(k,v) -> println("chave: $k - valor: $v") }

    println("-------------------------")


    val mapi2 =  mapOf(
        "joao" to 2000.0,
        "matheus" to 5000.0


    )

    mapi2.forEach{(a,b)-> println("chave: $a - valor: $b") }



}

