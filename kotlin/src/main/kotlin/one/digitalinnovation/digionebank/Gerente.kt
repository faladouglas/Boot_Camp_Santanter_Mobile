package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf:String ,
    cargo:String,
    salario:Double,
    val senha:String
)  :Funcionario(nome, cpf, cargo ,salario),Logavel{
    override fun calculoAuxilio(): Double = salario *0.4

    override fun login(): Boolean  = "senha123" == senha


}