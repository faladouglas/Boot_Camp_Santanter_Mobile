package one.digitalinnovation.collection

fun main() {
    val douglas = funcionario("douglas",9500.0, 31,"clt")
    val pedro = funcionario("pedro",2000.0,20,"autonomo")
    val matheus = funcionario("matheus",5500.0,25,"autonomo")

    val funcionarios = mutableListOf(douglas, pedro ) //mutablelist é uma list mutavel
    println("\n--------list   ---------")
    funcionarios.forEach{ println("\n"+it) }

    println("\n-------adicionamos matheus----------")

    funcionarios.add(matheus) // adicionamos matheus usando add
    funcionarios.forEach{ println("\n"+it) }

    println("\n--------removemos douglas---------")

    funcionarios.remove(douglas) // removemos douglas
    funcionarios.forEach{ println("\n"+it) }

    println("\n--------Set---------")//não usar elementos repetidos

    val funcionariosSet = mutableSetOf(douglas)
    funcionariosSet.forEach{ println("\n"+it) }
    println("\n--------add pedro e matheus---------")

    funcionariosSet.add(pedro)
    funcionariosSet.add(matheus)
    funcionariosSet.forEach{ println("\n"+it) }

    println("\n--------removendo pedro e douglas---------")

    funcionariosSet.remove(pedro)
    funcionariosSet.remove(douglas)
    funcionariosSet.forEach{ println("\n"+it) }

}