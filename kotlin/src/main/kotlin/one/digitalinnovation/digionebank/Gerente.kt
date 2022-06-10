package one.digitalinnovation.digionebank

class Gerente(nome: String,
              cpf:String ,
              cargo:String,
              salario:Double
)  :Funcionario(nome, cpf, cargo ,salario){
    override fun calculoAuxilio(): Double = salario *0.4


}