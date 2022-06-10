package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Conta(
    val agencia : String = "4235-1",
    val numeroconta:String = "3687962-0",
    val saldo :BigDecimal,
) {
    fun deposito(valor:BigDecimal){

    }
    fun saque (valor:BigDecimal){
        
    }
}