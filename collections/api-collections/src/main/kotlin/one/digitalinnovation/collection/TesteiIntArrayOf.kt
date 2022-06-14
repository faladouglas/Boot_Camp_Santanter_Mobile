package one.digitalinnovation.collection

fun main() {

    val values = intArrayOf (2,5,13,9,12,6,8) //usando o Intarray não precisamor declarar a quantidade de posições

   values.forEach {
       println(it)
   }
    println("--------------------")
    values.sort()
    values.forEach {
        println(it)
    }
    println("----------------------")
}