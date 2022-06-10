package one.digitalinnovation.digionebank

data class Banco( // data class : utilizar quando não for modificar os value das variaveis no caso Val caso seja necessario utilizar a propriedade copy
    val nome:String,
    val numero:Int,
    val area:Int,



){
    fun info () = "nome: $nome  \nnumero: $numero  \narea: $area"
}
