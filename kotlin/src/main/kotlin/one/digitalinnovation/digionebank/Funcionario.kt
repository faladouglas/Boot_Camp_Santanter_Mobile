package one.digitalinnovation.digionebank



 abstract class Funcionario(
      nome :String,
      cpf :String,
     val  cargo:String,
     val salario :Double,



     ) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio():Double // (protected) apenas a classe funcionario e classes filhas conseguira fazer o uso do calculoAuxilio
     override fun toString(): String ="""
         Nome: $nome
         Cpf: $cpf
         Cargo: $cargo
         Salario: R$ $salario
         Auxilio: R$ ${calculoAuxilio()}
     """.trimIndent()

 }









