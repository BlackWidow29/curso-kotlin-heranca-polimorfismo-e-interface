fun testaBreakContinueLabel() {
    loop@ for (i in 1..100) {
        println("i = $i")
        for (j in 1..100) {
            println("j = $j")
            if (j == 6) break@loop
        }
    }
}