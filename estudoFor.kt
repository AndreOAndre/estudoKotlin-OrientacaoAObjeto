fun estudoFor() {
//------- estudo com for:--------

    //----- i in 1..5 -> o indice de 1 a 5 (lembrando que o indice (i) começa do 0 para frente ----//
    var i = 0
    for (i in 1..5) {
        println(i)
        println("")
    }

    //---- i in 5 downTo 1 -> o indice contando do 5 ao 1 -> downTo -> serve para decrescente ----//
    for (i in 5 downTo 1) {
        println(i)
        println("")
    }

    // ---- i in 5 downTo 1 step 2 -> o indice contando do 5 ao 1 -> step -> serve para pular o  indice -> step 2 = 5, 3, 1 ----//
    for (i in 5 downTo 1 step 2) {
        println(i)
        println("")


        for (i in 1..5) {
            fun estudoBreakAndContinue() {
                //---- parar ou pular um indice ---//
                if (i == 4) {
//                    continue //- neste caso a máquina vai pular o indice 4 = {1, 2, 3, 5}
//                    break //- neste caso a máquina vai parar de processar o código no indice determinado (4) = {1, 2, 3}
                }

            }
//
//            val titular = "Alex $i"
//            val conta = 1000 + i
//            var saldo = i + 10.0
//
//            println("titular da conta: $titular")
//            println("número da conta: $conta")
//            println("saldo da conta: $saldo")
//            println()
//            testeCondicao(saldo)
//            println(".")
//            println(".")
        }
    }
}