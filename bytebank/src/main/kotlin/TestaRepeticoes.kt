fun testaRepeticoes() {
    for (i in 1..5) {
        println("$i")
    }
    for (i in 10 downTo 1 step 2) {
        println("Ordem inversa $i")
    }

    var i = 0
    while (i < 5) {
        println("$i")
        i++
    }
}