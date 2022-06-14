package one.digitalinnovation.collection

fun main() {

        val salarios = doubleArrayOf(1000.0,2500.0,5000.0)
        for (salario in salarios){
            println(salario)

        }
    println("---------------------------------")
        println("maior salario: ${salarios.maxOrNull()}")//maior valor
        println("menor salario: ${salarios.minOrNull()}")//menor valor
        println("media salario: ${salarios.average()}") //media dos valores
        println("quantos salarios tem dentro da array: ${salarios.count()}") //posições em uma array

    println("---------------------------------")

    val salarioMaiorQue2500 = salarios.filter { it >= 2500.0 } // foi utilizado uma nova variavel para fazer busca dentro de uma array na qual me mostra os valores caso a condição seja verdadeira e armazenar os valores nessa nova variavel
    salarioMaiorQue2500.forEach { println("salarios maior que 2500.0 : "+it) }

    println("---------------------------------")

    println("quantos salarios estão entre 2000.0 e 5000.0 : "+salarios.count { it in 2000.0..5000.0 }) // estou buscando valores dentro da array que satisfazem minhas condições , obs: apenas busca, não armazena em variavel

    println("---------------------------------")

    println("encontre o valor 1000.0 : "+salarios.find { it == 1000.0}) // encontra um valor especifico , caso não encontre retorna null
    println("encontre o valor 1100.0 : "+salarios.find { it == 1100.0})


    println("---------------------------------")
    println("existe algum valor de 1000.0 : "+salarios.any { it == 1000.0}) // procura um valor dentro de uma array que satisfaça e me traga true , caso não encontre retorna false
    println("existe algum valor de  1900.0 : "+salarios.any { it == 1900.0})
}
