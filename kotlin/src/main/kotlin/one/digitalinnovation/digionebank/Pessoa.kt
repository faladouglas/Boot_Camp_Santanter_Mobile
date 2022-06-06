package one.digitalinnovation.digionebank

class Pessoa {

    var nome : String = "douglas"
        private set //não permite modificar os dados de outros lugares !!! porem permite usar o get (chamada)
    var cpf:String = "367.585.896-98"
        private set





}
fun main(){
    val douglas = Pessoa()

    println(douglas.nome)
    println(douglas.cpf)
}