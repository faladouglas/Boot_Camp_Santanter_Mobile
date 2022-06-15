package one.digitalinnovation.collection

fun main() {

    val douglas = funcionario("douglas", 9500.0, 31, "clt")
    val pedro = funcionario("pedro", 2000.0, 20, "autonomo")
    val matheus = funcionario("matheus", 5500.0, 25, "autonomo")

    val repositorio = Repositorio<funcionario>()
    repositorio.created(pedro.nome,pedro)
    repositorio.created(douglas.nome,douglas)
    repositorio.created(matheus.nome,matheus)

    println(repositorio.findById(douglas.nome   ))

    println("--------------------------------")

    repositorio.findAll().forEach{ println("\n"+it) }

    repositorio.remove(douglas.nome)
    println("--------------------------------")
    repositorio.findAll().forEach{ println("\n"+it) }

}