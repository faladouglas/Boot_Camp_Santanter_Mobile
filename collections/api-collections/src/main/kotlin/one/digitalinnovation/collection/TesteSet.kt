package one.digitalinnovation.collection



    fun main() {
        val douglas = funcionario("douglas", 9500.0, 31, "clt")
        val pedro = funcionario("pedro", 2000.0, 20, "autonomo")
        val matheus = funcionario("matheus", 5500.0, 25, "autonomo")



        val funcionarios1 = setOf(douglas, pedro )
        val funcionarios2 = setOf(matheus)
        val resultUniao = funcionarios1.union(funcionarios2)//faz a uniao de duas variaveis (bom para realizar relatorio geral )

        resultUniao.forEach{ println("\n"+it) }
    println("----------------------------")

        val funcionarios3 = setOf(douglas , pedro,matheus )
        val resultsubtracao = funcionarios3.subtract(funcionarios2) //tira o que é igual das variaveis
        resultsubtracao.forEach{ println("\n"+it) }
        println("----------------------------")

       val resultintersect = funcionarios3.intersect(funcionarios2) // mostra o que tem de igual entre as variaveis
        resultintersect.forEach{ println("\n"+it) }



    }
