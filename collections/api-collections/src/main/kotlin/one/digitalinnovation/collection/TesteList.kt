package one.digitalinnovation.collection

fun main() {
    val douglas = funcionario("douglas",9500.0, 31,"clt")
    val pedro = funcionario("pedro",2000.0,20,"autonomo")
    val matheus = funcionario("matheus",5500.0,25,"autonomo")

    val funcionarios = listOf(douglas, pedro , matheus)
    funcionarios.forEach{
        println("\n"+it)


    }
    println("---------------------------")
    println("existe um funcionario de nome douglas ? \n"+ funcionarios.any { it.nome == "douglas" })

    println("\nordem por salario\n")
    funcionarios.sortedBy { it.salario }.forEach { println(it) } // organiza de forma crescente

    println("\nordenação por tipo de  contrato\n")
    funcionarios.groupBy { it.tipoContratacao }.forEach{ println(it) } //groupby faz agrupamentos de elementos

}

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
