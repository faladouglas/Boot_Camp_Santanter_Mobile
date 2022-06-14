package one.digitalinnovation.collection

data class funcionario(
    val nome:String,
    val salario:Double,
    val idade:Int,
    val tipoContratacao:String,


    ){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
        Idade: $idade
        Contrato: $tipoContratacao
    """.trimIndent()

}

