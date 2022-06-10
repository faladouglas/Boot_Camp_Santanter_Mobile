package one.digitalinnovation.digionebank

class Analista(nome: String,
               cpf: String,
               cargo:String,
               salario: Double
                ): Funcionario(nome, cpf,cargo, salario) {
    override fun calculoAuxilio() = salario * 0.1



}