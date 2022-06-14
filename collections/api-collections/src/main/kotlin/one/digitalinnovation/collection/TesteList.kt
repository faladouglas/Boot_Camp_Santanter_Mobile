package one.digitalinnovation.collection

fun main() {
    val douglas = funcionario("douglas",9500.0, 31)
    val pedro = funcionario("pedro",2000.0,20)
    val matheus = funcionario("matheus",5500.0,25)

    val funcionarios = listOf(douglas, pedro , matheus)
    funcionarios.forEach{
        println("\n"+it)


    }
    println("---------------------------")
    println("existe um funcionario de nome douglas ? \n"+ funcionarios.any { it.nome == "douglas" })

    println("\nordem por salario\n")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("\nordem por idade\n")
    funcionarios.sortedBy { it.idade }.forEach{ println(it) }

}

data class funcionario(
    val nome:String,
    val salario:Double,
    val idade:Int,


){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
        Idade: $idade
    """.trimIndent()

    }
