package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco
import one.digitalinnovation.digionebank.ClienteTipo


fun main(){
    val digiOneBank = Banco("Digionebank", 25,  5)
    println("Banco 1 \n")
    println("nome: "+ digiOneBank.nome)
    println("numero: " + digiOneBank.numero)
    println("Area: " + digiOneBank.area)


    val banco2 = digiOneBank.copy(nome = "DigioneBank - 2", numero = 30 , area = 8 ) //copy permite modificar propriedades sem que se seja mudado a classe fonte no casa a data class
    println("\nBanco 2 \n")
    println(banco2.info())


        println(ClienteTipo.PF)
        println(ClienteTipo.PJ)



}
