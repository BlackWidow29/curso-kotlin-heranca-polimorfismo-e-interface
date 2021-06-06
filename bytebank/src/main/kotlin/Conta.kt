class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
        private set

    /*
    init {
        //Executa alguma coisa durante a execução
    }
     */

    //Usado quando desejamos fazer outras coisas com o construtor além da inicialização
//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double): Boolean {
        return when {
            valor > this.saldo -> false
            else -> {
                this.saldo -= valor
                true
            }
        }
    }

    fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (this.saca(valor)) {
            contaDestino.deposita(valor)
            return true
        }
        return false
    }
}