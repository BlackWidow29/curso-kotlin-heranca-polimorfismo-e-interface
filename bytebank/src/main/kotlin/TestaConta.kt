fun testaConta(){
    var conta = Conta(titular = "Isabelly Dias", numero = 48751)
    conta.deposita(1400.0)

    conta.deposita(100.0)
    println(conta.saca(200.0))

    var conta2 = Conta("Maria Dias", 56781)
    conta2.deposita(2000.0)

    if (conta2.transfere(contaDestino = conta, valor = 200.0)){
        println("Transferência sucedida")
    }
    else{
        println("Falha na transferência")
    }

    println("${conta.saldo}")
    println("${conta2.saldo}")
}