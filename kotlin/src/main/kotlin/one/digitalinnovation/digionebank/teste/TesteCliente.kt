package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo
fun main(){

    val marcelo = Cliente (
        "Marcelo Godofredo" ,
        "332.698.785-3",
        clienteTipo = ClienteTipo.PF,
        "senha123456")
    println(marcelo)

    TesteAutenticacao().autentica(marcelo)

}


