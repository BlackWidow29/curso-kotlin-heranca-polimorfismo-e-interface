fun testaLacos() {
    for (i in 1..5) {
        if (i == 4) {
            break
        }
        val titular: String = "Isabelly Dias $i"
        val numeroConta: Int = 1000 + i
        var saldo = 10.0 + i


        println("Titular $titular")
        println("Número de conta $numeroConta")
        println("Saldo da conta $saldo")
    }
}