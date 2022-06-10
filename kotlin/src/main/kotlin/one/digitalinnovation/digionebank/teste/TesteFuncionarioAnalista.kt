package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main (){


    val joao = Analista("joao carlos ","11158965-6", "analista",2000.0)



   imprimeRelatorio(joao)



}

fun imprimeRelatorio(funcionario: Funcionario) = println( funcionario.toString())


