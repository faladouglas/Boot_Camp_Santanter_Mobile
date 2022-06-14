package one.digitalinnovation.collection

fun main() {
    val douglas = funcionario("douglas",9500.0)
    val pedro = funcionario("pedro",2000.0)
    val matheus = funcionario("matheus",5500.0)

    val funcionarios = listOf(douglas, pedro , matheus)
    funcionarios.forEach{
        println("\n"+it)


    }
    println("---------------------------")
    println("existe um funcionario de nome douglas ? \n"+ funcionarios.any { it.nome == "douglas" })
    println("\n"+ funcionarios.find { it.nome == "douglas" })



}

data class funcionario(
    val nome:String,
    val salario:Double,


){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
    """.trimIndent()

    }
